package com.cogent.repo;

import com.cogent.model.Employee;

public class EmployeeRepo {

	
	private Employee[] employees= new Employee[2];
	int index=0;
	//1. Add Employee
	public void addEmployee(Employee employee) {
		// Code for adding employee to the array
		if(index < employees.length)
		{		
			employees[index] = employee;				
		}
		else
		{
			Employee temp[] = employees;
			int arrSize = employees.length;
			arrSize *= 2;
			employees = new Employee[arrSize];
			index = 0;
			
			for(Employee e : temp)
			{
				employees[index] = e;
				
				index++;
			}
						
			employees[index] = employee;	
		}
		index++;
	}
	//2. Print All Employee
	public Employee[] printAllEmployees() {
		return employees;
	}
	
	public void deleteEmployee(int id)
	{
		int deleteIndex = searchEmployee(id);
		
		
		System.out.println("deleteIndex: " + deleteIndex);
		for(int i = deleteIndex + 1; i<employees.length; i++)
		{
			if(employees[i] != null) {
				employees[i - 1] = employees[i];
				employees[i] = null;
			}
		}
		
		index--;
	}
	
	public int searchEmployee(int id)
	{	
		int i = 0;
		int empIndex = -1;
		
		boolean found = false;
		
		while(!found && i < employees.length)
		{	
			if(employees[i] != null && employees[i].getEmpId()==id)
			{
				System.out.println("found it: " + i);
				found = true;
				empIndex = i;
			}
			
			i++;
		}
		
		System.out.println("empIndex: " + empIndex);
		
		return empIndex;
	}
	
	public int searchEmployee(String city)
	{		
		int i = 0;
		
		while(i < employees.length)
		{
			if(employees[i] != null && employees[i].getCity()==city)
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
			for(int i = 0; i < employees.length; i++)
			{
				if(employees[i] != null)
				{			
					if(employees[i].getEmployeeName() == employee.getEmployeeName()
					&& employees[i].getEmpId() == employee.getEmpId()
					&& employees[i].getCity() == employee.getCity()) {
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
	public Employee[] getEmployees() {
		return employees;
	}
	
	public void printEmployeeByCity(String empCity)
	{
		for(Employee e : employees)
		{
			if(e.getCity().equals(empCity))
				System.out.println(e.toString());
		}
	}	
	/*
	 * Update: Add one more attribute in Employee class: City
	 * 3. Search Employee By Id
	 * 4. Delete Employee By Id
	 * 5. update Employee
	 * 6. Find Duplicate Employee
	 * 7. Search Employee By City
	 * 8. Tricky- Print Employee By city
	 */
}
