package de.slackspace.tutorials.dao;

import java.util.List;

import de.slackspace.tutorials.entity.Person;

public interface PersonDao {

	public Person save(Person person);
	
	public List<Person> findPersons();
	
}
