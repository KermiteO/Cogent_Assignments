package com.jdbc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.jdbc.model.Person;
import com.jdbc.util.DbUtil;

public class PersonDaoImpl implements PersonDao{

	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	public void addPerson(Person person) {
		try {
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			String query="insert into person_tb1 values("+person.getPid()+", '"+person.getPname()+"','"+person.getPemail()+"', '"+person.getPcity()+"')";
			
			stmt.execute(query);
			
			System.out.println("New person added to database!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.closeConnection(con, stmt);
		}
	}

	public Person findPersonById(int pId) {

		Person person = null;
		
		try {
			con = DbUtil.getConnection();
			stmt = con.createStatement();

			String query = "select * from person_tb1 where pid="+pId+"";
			
			rs = stmt.executeQuery(query);
			
			while(rs.next())
			{
				person = new Person(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbUtil.closeConnection(con, stmt, rs);
		}
		
		return person;
	}

	public List<Person> findAllPersons() {
		List<Person> people = new ArrayList<Person>();
		
		try {
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			
			String query = "select * from person_tb1";
			rs = stmt.executeQuery(query);
			
			while(rs.next())
			{
				people.add(new Person(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbUtil.closeConnection(con, stmt, rs);
		}
		
		return people;
	}

}
