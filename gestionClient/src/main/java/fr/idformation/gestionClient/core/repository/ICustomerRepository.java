package fr.idformation.gestionClient.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.idformation.gestionClient.core.domain.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {

	/**
	 *
	 * @param startWith a begining of the customers name
	 * @return all the customers whose name starts with {@startWith}
	 */
	List<Customer> findByNomStartingWith(String startWith);

}
