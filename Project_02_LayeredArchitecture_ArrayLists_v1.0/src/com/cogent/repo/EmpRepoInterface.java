package com.cogent.repo;
import java.util.ArrayList;

import com.cogent.model.Employee;

public interface EmpRepoInterface {
	public void addEmployee(Employee employee);
	
	public ArrayList<Employee> printAllEmployees();
	
	public void deleteEmployee(int id);
	
	public int searchEmployee(int id);
	
	public int searchEmployee(String city);
	
}
