package de.slackspace.tutorials.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import de.slackspace.tutorials.dao.PersonDao;
import de.slackspace.tutorials.entity.Person;

@Component("pageController")
@Scope("request")
@Transactional
public class PageController {

	@Autowired
	private PersonDao personDao;
	
	private List<Person> personList = new ArrayList<Person>();
	
	private String firstname;
	private String surname;
	
	public void save() {
		Person person = new Person();
		person.setFirstname(firstname);
		person.setSurname(surname);
		personDao.save(person);
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public List<Person> getPersonList() {
		personList = personDao.findPersons();
		return personList;
	}
}
