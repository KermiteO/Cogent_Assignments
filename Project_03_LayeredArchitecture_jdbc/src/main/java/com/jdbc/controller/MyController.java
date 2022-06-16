package com.jdbc.controller;

import com.jdbc.model.Person;
import com.jdbc.services.PersonServices;
import com.jdbc.services.PersonServicesImpl;

public class MyController {

    PersonServices ps = new PersonServicesImpl();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyController mc = new MyController();
		mc.addNewPerson();
		
		System.out.println(mc.ps.findPersonById(2).toString());
		
		System.out.println(mc.ps.findAllPersons().toString());
		
		
	}
	
	public void addNewPerson() {
		Person p1 = new Person(1, "Omar", "kermicheo@gmail.com", "Dana Point");
		Person p2 = new Person(2, "Luffy", "luffy@gmail.com", "Rio");
		Person p3 = new Person(3, "Zoro", "zoro@gmail.com", "Iroshima");

		ps.addPerson(p1);
		ps.addPerson(p2);
		ps.addPerson(p3);
	}
	
	

}
