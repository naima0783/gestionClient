package fr.idformation.gestionClient.core.dto;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import fr.idformation.gestionClient.core.domain.Customer;
import fr.idformation.gestionClient.core.dto.mapper.CustomerMapper;

@SpringBootTest
public class CustomerMapperTest {

	/**
	 * Tests the default constructor for the mapper
	 */
	@Test
	public void defaultConstructor() {
		// given

		// when
		CustomerMapper mapper = new CustomerMapper();

		// then
		Assert.notNull(mapper, "default constructor returned a null object");
		Assert.isTrue(mapper.getClass().equals(CustomerMapper.class), "default constructor returned a null object");
	}

	@Test
	public void nullToDto() {
		// given
		Customer cust = null;

		// when
		CustomerDTO dto = CustomerMapper.customerToDto(cust);

		// then
		Assert.isNull(dto, "dto should be null when entity is null");
	}

}
