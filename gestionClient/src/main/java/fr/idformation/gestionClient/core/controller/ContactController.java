package fr.idformation.gestionClient.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.idformation.gestionClient.core.dto.ContactDTO;
import fr.idformation.gestionClient.core.dto.mapper.ContactMapper;
import fr.idformation.gestionClient.core.service.impl.ContactService;

@RestController
@RequestMapping("/contact")
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
public class ContactController {

	@Autowired
	private ContactService contactService;

	@GetMapping("/")
	public List<ContactDTO> getAll() {
		return ContactMapper.contactsToDtos(contactService.getAllContact());
	}

}
