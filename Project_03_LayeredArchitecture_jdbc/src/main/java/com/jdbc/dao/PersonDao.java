package com.jdbc.dao;

import java.util.List;

import com.jdbc.model.Person;

public interface PersonDao {
	public void addPerson(Person person);
	public Person findPersonById(int pId);
	public List<Person> findAllPersons();
}
