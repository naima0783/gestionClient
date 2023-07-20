package fr.idformation.gestionClient.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.idformation.gestionClient.core.domain.ContactType;

@Repository
public interface IContactTypeReposotory extends JpaRepository<ContactType, Long> {

}
