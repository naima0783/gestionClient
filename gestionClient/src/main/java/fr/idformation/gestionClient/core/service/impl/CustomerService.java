package fr.idformation.gestionClient.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.idformation.gestionClient.core.domain.Customer;
import fr.idformation.gestionClient.core.repository.ICustomerRepository;
import fr.idformation.gestionClient.core.service.ICustomerService;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private ICustomerRepository repoClient;

	@Override
	public Customer getOne(Long id) {
		return repoClient.findById(id).get();
	}

	@Override
	public Customer update(Customer client) {
		return repoClient.save(client);

	}

	@Override
	public void delete(Long id) {
		repoClient.deleteById(id);
	}

	@Override
	public List<Customer> getAll() {
		return repoClient.findAll();
	}

	public List<Customer> getAllCustomerFilteredBy(String startWith) {
		return repoClient.findByNomStartingWith(startWith);
	}

}
