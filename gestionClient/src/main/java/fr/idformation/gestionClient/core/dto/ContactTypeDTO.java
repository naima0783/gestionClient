package fr.idformation.gestionClient.core.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import fr.idformation.gestionClient.core.domain.Contact;
import fr.idformation.gestionClient.core.domain.ContactType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactTypeDTO {

	private Short id;
	private String label;
	private List<Contact> contacts;

	public ContactTypeDTO() {
		super();
	}

	public ContactTypeDTO(ContactType type) {
		super();
		this.id = type.getId();
		this.label = type.getLabel();
	}

	/**
	 * @return the id
	 */
	public Short getId() {
		return id;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @return the contacts
	 */
	public List<Contact> getContacts() {
		return contacts;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Short id) {
		this.id = id;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @param contacts the contacts to set
	 */
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

}
