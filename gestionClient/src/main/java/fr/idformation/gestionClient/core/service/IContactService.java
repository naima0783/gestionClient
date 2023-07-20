package fr.idformation.gestionClient.core.service;

import java.util.List;
import java.util.NoSuchElementException;

import fr.idformation.gestionClient.core.domain.Contact;

public interface IContactService {

	public List<Contact> getAllContact();

	public Contact getOne(Long id) throws NoSuchElementException;

	void updeat(Contact contact);

	void delete(Long id);

	void add(Contact contact);

}
