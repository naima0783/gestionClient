package fr.idformation.gestionClient.core.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import fr.idformation.gestionClient.core.domain.Contact;
import fr.idformation.gestionClient.core.dto.ContactDTO;

public class ContactMapper {

	public static List<ContactDTO> contactsToDtos(List<Contact> contacts) {
		return contactsToDtos(contacts, false);
	}

	public static List<ContactDTO> contactsToDtos(List<Contact> contacts, boolean addCustomer) {
		List<ContactDTO> dtos = null;

		if (contacts != null) {
			dtos = new ArrayList<ContactDTO>();
			for (Contact con : contacts) {
				dtos.add(contactToDto(con, addCustomer));
			}
		}

		return dtos;

	}

	/**
	 * Turn a Contact into a ContactDTO, the customer is returned by default
	 *
	 * @param contact the contact
	 * @return the contact turned into its ContactDTO sibling
	 */
	public static ContactDTO contactToDto(Contact contact) {
		return contactToDto(contact, false);
	}

	/**
	 * Turn a Contact into a ContactDTO
	 *
	 * @param contact     the contact
	 * @param addCustomer indicates if the customer has to be added to the response
	 * @return the contact turned into its ContactDTO sibling
	 */
	public static ContactDTO contactToDto(Contact contact, boolean addCustomer) {
		ContactDTO dto = null;

		if (contact != null) {
			dto = new ContactDTO(contact);
			if (addCustomer) {
				dto.setCustomer(CustomerMapper.customerToDto(contact.getCustomer(), false));
			}
		}

		return dto;
	}

	public static Contact dtoToContact(ContactDTO contact) {
		Contact entity = null;

		if (contact != null) {
			entity = new Contact();
			entity.setId(contact.getId());
			entity.setValeur(contact.getValeur());
			if (contact.getType() != null) {
				entity.setType(ContactTypeMapper.dtoToContactType(contact.getType()));
			}
		}

		return entity;
	}

}
