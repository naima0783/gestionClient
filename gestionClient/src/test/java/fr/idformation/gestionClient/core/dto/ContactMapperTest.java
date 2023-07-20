package fr.idformation.gestionClient.core.dto;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import fr.idformation.gestionClient.core.domain.Contact;
import fr.idformation.gestionClient.core.dto.mapper.ContactMapper;

@SpringBootTest
public class ContactMapperTest {

	/**
	 * Tests the default constructor for the mapper
	 */
	@Test
	public void defaultConstructor() {
		// given

		// when
		ContactMapper mapper = new ContactMapper();

		// then
		Assert.notNull(mapper, "default constructor returned a null object");
		Assert.isTrue(mapper.getClass().equals(ContactMapper.class), "default constructor returned a null object");
	}

	@Test
	public void nullToDto() {
		// given
		Contact cont = null;

		// when
		ContactDTO dto = ContactMapper.contactToDto(cont);

		// then
		Assert.isNull(dto, "dto should be null when entity is null");
	}
}
