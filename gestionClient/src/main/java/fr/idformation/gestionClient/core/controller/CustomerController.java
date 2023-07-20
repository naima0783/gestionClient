package fr.idformation.gestionClient.core.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.idformation.gestionClient.core.dto.CustomerDTO;
import fr.idformation.gestionClient.core.dto.mapper.CustomerMapper;
import fr.idformation.gestionClient.core.service.impl.CustomerService;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/client")
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/all")
	@PreAuthorize("hasAnyRole( 'ADMIN')")
	public List<CustomerDTO> getAll() {
		return CustomerMapper.customersToDtos(customerService.getAll());
	}

	@GetMapping("/edit/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public CustomerDTO getOne(@PathVariable Long id, HttpServletResponse response) {
		try {
			return CustomerMapper.customerToDto(customerService.getOne(id));
		} catch (NoSuchElementException e) {
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			return null;
		}
	}

	@PostMapping("/edit/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public boolean update(@RequestBody CustomerDTO customer) {
		try {
			customerService.update(CustomerMapper.dtoToEntity(customer));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@DeleteMapping("/edit/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public void delete(@PathVariable Long id, HttpServletResponse response) {
		try {
			customerService.delete(id);
			response.setStatus(HttpServletResponse.SC_OK);

		} catch (Exception e) {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}

	}

	/**
	 * @return all the client filtered with the begin of their name as a List of
	 *         ClientDTO
	 */
	@GetMapping("/search")
	public List<CustomerDTO> getAllFiltered(@RequestParam(name = "q") String startWith) {
		return CustomerMapper.customersToDtos(customerService.getAllCustomerFilteredBy(startWith));
	}

}
