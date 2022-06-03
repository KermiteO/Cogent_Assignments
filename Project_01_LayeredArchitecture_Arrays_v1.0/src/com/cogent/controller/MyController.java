package com.cogent.controller;

import java.util.Arrays;
import java.util.Scanner;

import com.cogent.model.Employee;
import com.cogent.service.EmployeeService;

public class MyController {
	EmployeeService employeeService= new EmployeeService();
	
	public static void main(String[] args) {
		MyController controller = new MyController();
		controller.addEmployee();
		controller.getAllEmployees();

		controller.employeeService.deleteEmployee(0);
		
		controller.getAllEmployees();
	}

	public void addEmployee() {
		// populate the employee object
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			Employee employee = new Employee();
			System.out.println("Please enter employee id");
			employee.setEmpId(scanner.nextInt());
			System.out.println("Please enter employee name");
			employee.setEmployeeName(scanner.next());
			System.out.println("Please enter employee city");
			employee.setCity(scanner.next());
			// sent the object to the service layer

			employeeService.addEmployee(employee);
			System.out.println(i+1+ " Employee Added");
		}
		
		
	}

	public void getAllEmployees() {
		Employee[] allEmployees = employeeService.printAllEmployees();
		System.out.println(Arrays.toString(allEmployees));
	}
}
