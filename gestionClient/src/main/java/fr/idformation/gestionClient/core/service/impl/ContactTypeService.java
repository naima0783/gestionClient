package fr.idformation.gestionClient.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.idformation.gestionClient.core.domain.ContactType;
import fr.idformation.gestionClient.core.repository.IContactTypeReposotory;
import fr.idformation.gestionClient.core.service.IContactTypeService;

@Service
public class ContactTypeService implements IContactTypeService {

	@Autowired
	private IContactTypeReposotory repo;

	@Override
	public List<ContactType> getAll() {
		return repo.findAll();

	}

}
