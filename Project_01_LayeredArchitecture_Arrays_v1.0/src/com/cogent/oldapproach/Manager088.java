package com.cogent.oldapproach;

import java.util.Arrays;
import java.util.Scanner;
class Employee{
	private int empId;
	private String employeeName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String employeeName) {
		super();
		this.empId = empId;
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", employeeName=" + employeeName + "]";
	}
	
}
public class Manager088 {
	public static void main(String[] args) {
		//1 Take input from user & create an Employee Object
		Employee employee= new Employee();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter employee ID");
		employee.setEmpId(sc.nextInt());
		System.out.println("Please enter employee Name");
		employee.setEmployeeName(sc.next());
		
		
		//2. Adding Employee into Array
		
		//int [] arr= new int[10];
		Employee[] employees= new Employee[10];
		employees[0]=employee;
		
		//3. Print the Array
		System.out.println(Arrays.toString(employees));
		
	}
}


























