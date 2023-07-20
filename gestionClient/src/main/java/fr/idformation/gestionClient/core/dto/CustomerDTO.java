package fr.idformation.gestionClient.core.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import fr.idformation.gestionClient.core.domain.Customer;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDTO {

	private Long id;
	private String nom;
	private String prenom;
	private String adresse;
	private String codePostal;
	private String pays;

	private List<ContactDTO> contacts;

	public CustomerDTO() {
		super();
	}

	public CustomerDTO(Customer client) {
		super();
		this.id = client.getId();
		this.nom = client.getNom();
		this.prenom = client.getPrenom();
		this.adresse = client.getAdresse();
		this.codePostal = client.getCodePostal();
		this.pays = client.getPays();
	}

	public CustomerDTO(long id, String prenom, String nom, String adresse, String cp, String pays,
			List<ContactDTO> contacts) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = cp;
		this.pays = pays;
		this.contacts = contacts;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @return the codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}

	/**
	 * @return the pays
	 */
	public String getPays() {
		return pays;
	}

	/**
	 * @return the contacts
	 */
	public List<ContactDTO> getContacts() {
		return contacts;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * @param pays the pays to set
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}

	/**
	 * @param contacts the contacts to set
	 */
	public void setContacts(List<ContactDTO> contacts) {
		this.contacts = contacts;
	}

}
