package com.cogent.repo;

import java.util.ArrayList;

import com.cogent.model.Employee;

public class EmployeeRepo implements EmpRepoInterface{

	
	private ArrayList<Employee> employees= new ArrayList<Employee>();
	//1. Add Employee
	public void addEmployee(Employee employee) {
		// Code for adding employee to the array
		employees.add(employee);
	}
	//2. Print All Employee
	public ArrayList<Employee> printAllEmployees() {
		return employees;
	}
	
	public void deleteEmployee(int id)
	{
		int deleteIndex = searchEmployee(id);
		
		employees.remove(deleteIndex);
		
	}
	
	public int searchEmployee(int id)
	{	
		int i = 0;
		int empIndex = -1;
		
		boolean found = false;
		
		while(!found && i < employees.size())
		{	
			if(employees.get(i) != null && employees.get(i).getEmpId()==id)
			{
				found = true;
				empIndex = i;
			}
			
			i++;
		}
		
		
		return empIndex;
	}
	
	public int searchEmployee(String city)
	{		
		int i = 0;
		
		while(i < employees.size())
		{
			if(employees.get(i) != null && employees.get(i).getCity()==city)
			{
				return i;
			}
			i++;
		}
		return -1;
	}
	
	public boolean findDuplicateEmployee(Employee employee)
	{
		int totalDupes = 0;
		
		if(searchEmployee(employee.getEmpId()) != -1)
		{	
			for(int i = 0; i < employees.size(); i++)
			{
				if(employees.get(i) != null)
				{			
					if(employees.get(i).getEmployeeName() == employee.getEmployeeName()
					&& employees.get(i).getEmpId() == employee.getEmpId()
					&& employees.get(i).getCity() == employee.getCity()) {
						if(totalDupes == 0)
							totalDupes += 2;
						else
							totalDupes += 1;
						
					}					
				}											
			}
		}
			
		if(totalDupes > 1)
			return true;
		
		return false;
	}
	
	public void printEmployeeByCity(String empCity)
	{
		for(Employee e : employees)
		{
			if(e.getCity().equals(empCity))
				System.out.println(e.toString());
		}
	}	

}
