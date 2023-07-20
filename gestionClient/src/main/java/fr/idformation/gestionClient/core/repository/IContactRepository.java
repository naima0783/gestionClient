package fr.idformation.gestionClient.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.idformation.gestionClient.core.domain.Contact;

@Repository
public interface IContactRepository extends JpaRepository<Contact, Long> {

}
