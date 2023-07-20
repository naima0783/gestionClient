package fr.idformation.gestionClient.core.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import fr.idformation.gestionClient.core.domain.Contact;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactDTO {

	private Long id;
	private String valeur;
	private CustomerDTO customer;
	private ContactTypeDTO type;

	public ContactDTO() {
		super();
	}

	public ContactDTO(Contact contact) {
		super();
		this.id = contact.getId();
		this.valeur = contact.getValeur();

	}

	public ContactDTO(long id, String value, CustomerDTO customer, ContactTypeDTO type) {
		super();
		this.id = id;
		this.valeur = value;
		this.customer = customer;
		this.type = type;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the valeur
	 */
	public String getValeur() {
		return valeur;
	}

	/**
	 * @return the customer
	 */
	public CustomerDTO getCustomer() {
		return customer;
	}

	/**
	 * @return the type
	 */
	public ContactTypeDTO getType() {
		return type;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param valeur the valeur to set
	 */
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(ContactTypeDTO type) {
		this.type = type;
	}

}
