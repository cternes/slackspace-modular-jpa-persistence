package de.slackspace.tutorials.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import de.slackspace.tutorials.entity.Person;

@Repository
public class PersonDaoImpl implements PersonDao {

	@PersistenceContext
	private EntityManager em;
	
	public Person save(Person person) {
		em.persist(person);
		return person;
	}

	public List<Person> findPersons() {
		return em.createQuery("SELECT p FROM Person p").getResultList();
	}

}
