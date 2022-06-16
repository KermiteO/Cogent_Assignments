package com.jdbc.services;

import java.util.List;

import com.jdbc.dao.PersonDaoImpl;
import com.jdbc.model.Person;

public class PersonServicesImpl implements PersonServices{

	PersonDaoImpl dao = new PersonDaoImpl();
	
	public void addPerson(Person person) {
		dao.addPerson(person);	
	}

	public Person findPersonById(int pId) {
		return dao.findPersonById(pId);
	}

	public List<Person> findAllPersons() {
		return dao.findAllPersons();
	}

}
