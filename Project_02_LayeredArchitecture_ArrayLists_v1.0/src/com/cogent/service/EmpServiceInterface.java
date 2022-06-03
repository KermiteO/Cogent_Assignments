package com.cogent.service;

import java.util.ArrayList;
import com.cogent.model.Employee;

public interface EmpServiceInterface 
{
	public void addEmployee(Employee employee);
	
	public ArrayList<Employee> printAllEmployees();
	
	public void deleteEmployee(int id);
	
	public int searchEmployee(int id);
	
	public int searchEmployee(String city);
}
