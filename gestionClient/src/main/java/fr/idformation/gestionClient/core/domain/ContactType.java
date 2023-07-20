package fr.idformation.gestionClient.core.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "type_contact")
public class ContactType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tco_id")
	private Short id;

	@Column(name = "tco_libelle")
	private String label;

	@OneToMany(mappedBy = "type")
	private List<Contact> contacts;

	public ContactType() {
		super();
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
