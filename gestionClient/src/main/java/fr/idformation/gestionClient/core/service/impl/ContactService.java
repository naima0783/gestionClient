package fr.idformation.gestionClient.core.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.idformation.gestionClient.core.domain.Contact;
import fr.idformation.gestionClient.core.repository.IContactRepository;
import fr.idformation.gestionClient.core.service.IContactService;

@Service
public class ContactService implements IContactService {

	@Autowired
	private IContactRepository repoContact;

	@Override
	public List<Contact> getAllContact() {
		return repoContact.findAll();

	}

	@Override
	public Contact getOne(Long id) throws NoSuchElementException {
		return repoContact.findById(id).get();
	}

	@Override
	public void updeat(Contact contact) {

	}

	@Override
	public void delete(Long id) {
		repoContact.deleteById(id);
	}

	@Override
	public void add(Contact contact) {
		repoContact.save(contact);
	}
}
