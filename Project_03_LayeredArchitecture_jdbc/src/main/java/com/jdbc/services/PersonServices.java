package com.jdbc.services;

import java.util.List;

import com.jdbc.model.Person;

public interface PersonServices {
	public void addPerson(Person person);
	public Person findPersonById(int pId);
	public List<Person> findAllPersons();
}
