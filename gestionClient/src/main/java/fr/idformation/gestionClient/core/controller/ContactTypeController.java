package fr.idformation.gestionClient.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.idformation.gestionClient.core.dto.ContactTypeDTO;
import fr.idformation.gestionClient.core.dto.mapper.ContactTypeMapper;
import fr.idformation.gestionClient.core.service.impl.ContactTypeService;

@RestController
@RequestMapping("/type")
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
public class ContactTypeController {

	@Autowired
	private ContactTypeService typeService;

	@GetMapping("/all")
	public List<ContactTypeDTO> getAll() {
		return ContactTypeMapper.contactsTypeToDTOs(typeService.getAll());
	}
}
