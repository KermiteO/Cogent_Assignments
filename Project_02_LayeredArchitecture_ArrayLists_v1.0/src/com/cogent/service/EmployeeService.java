package com.cogent.service;

import java.util.ArrayList;

import com.cogent.model.Employee;
import com.cogent.repo.EmployeeRepo;

public class EmployeeService implements EmpServiceInterface{
	public EmployeeRepo employeeRepo=new EmployeeRepo();
	
	public void addEmployee(Employee employee) {
		//call addEmployee() of Repo layer
		employeeRepo.addEmployee(employee);
	}
	
	public void deleteEmployee(int id)
	{
		employeeRepo.deleteEmployee(id);
	}
	
	public int searchEmployee(int id)
	{
		return employeeRepo.searchEmployee(id);
	}
	
	public int searchEmployee(String city)
	{
		return employeeRepo.searchEmployee(city);
	}
	
	public boolean findDuplicateEmployee(Employee employee)
	{
		return employeeRepo.findDuplicateEmployee(employee);
	}
	public ArrayList<Employee> printAllEmployees() {
		return employeeRepo.printAllEmployees();
	}
}
