package fr.idformation.gestionClient.core.service;

import java.util.List;
import java.util.NoSuchElementException;

import fr.idformation.gestionClient.core.domain.Customer;

public interface ICustomerService {

	public Customer update(Customer client);

	public void delete(Long id);

	public Customer getOne(Long id) throws NoSuchElementException;

	public List<Customer> getAll();

}
