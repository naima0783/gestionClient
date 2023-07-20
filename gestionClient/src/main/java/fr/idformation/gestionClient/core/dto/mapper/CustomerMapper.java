package fr.idformation.gestionClient.core.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import fr.idformation.gestionClient.core.domain.Customer;
import fr.idformation.gestionClient.core.dto.ContactDTO;
import fr.idformation.gestionClient.core.dto.CustomerDTO;

public class CustomerMapper {

	public static Customer dtoToEntity(CustomerDTO dto) {
		Customer entity = null;

		if (dto != null) {
			entity = new Customer();
			entity.setId(dto.getId());
			entity.setNom(dto.getNom());
			entity.setPrenom(dto.getPrenom());
			entity.setAdresse(dto.getAdresse());
			entity.setCodePostal(dto.getCodePostal());
			entity.setPays(dto.getPays());

			if (dto.getContacts() != null && !dto.getContacts().isEmpty()) {
				entity.setContacts(new ArrayList<>());
				for (ContactDTO contact : dto.getContacts()) {
					entity.addContact(ContactMapper.dtoToContact(contact));
				}
			}
		}

		return entity;
	}

	public static CustomerDTO customerToDto(Customer cust) {
		return customerToDto(cust, true);
	}

	public static CustomerDTO customerToDto(Customer cust, boolean addContacts) {
		CustomerDTO dto = null;

		if (cust != null) {
			dto = new CustomerDTO(cust);

			if (addContacts) {
				dto.setContacts(ContactMapper.contactsToDtos(cust.getContacts(), false));
			}
		}

		return dto;
	}

	public static List<CustomerDTO> customersToDtos(List<Customer> custs) {
		return customersToDtos(custs, true);
	}

	public static List<CustomerDTO> customersToDtos(List<Customer> custs, boolean addContacts) {
		List<CustomerDTO> dtos = null;

		if (custs != null) {
			dtos = new ArrayList<>();

			for (Customer client : custs) {
				dtos.add(customerToDto(client, addContacts));
			}
		}

		return dtos;
	}

}
