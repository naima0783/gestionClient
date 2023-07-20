package fr.idformation.gestionClient.core.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import fr.idformation.gestionClient.core.domain.ContactType;
import fr.idformation.gestionClient.core.dto.ContactTypeDTO;

public class ContactTypeMapper {

	/**
	 * Turn a ContactType into a ContactTypeDTO
	 *
	 * @param type the ContactType to convert
	 * @return the ContactType converted in ContactTypeDTO
	 */
	public static ContactTypeDTO contactTypeToDTO(ContactType type) {
		ContactTypeDTO dto = null;

		if (type != null) {
			dto = new ContactTypeDTO(type);
		}

		return dto;
	}

	public static List<ContactTypeDTO> contactsTypeToDTOs(List<ContactType> type) {
		List<ContactTypeDTO> dto = null;

		if (type != null) {
			dto = new ArrayList<>();
			for (ContactType contType : type) {
				dto.add(contactTypeToDTO(contType));
			}
		}

		return dto;
	}

	/**
	 * turn a ContactTypeDTO into a ContactType (no label)
	 *
	 * @param type a ContactTypeDTO
	 * @return a ContactType with the id set
	 */
	public static ContactType dtoToContactType(ContactTypeDTO type) {
		ContactType entity = new ContactType();

		entity.setId(type.getId());

		return entity;
	}

}
