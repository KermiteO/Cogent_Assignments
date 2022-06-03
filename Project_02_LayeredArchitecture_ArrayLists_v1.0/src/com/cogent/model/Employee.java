package com.cogent.model;

public class Employee {
	private int empId;
	private String employeeName;
	private String empCity;
	
	public String getCity() {
		return empCity;
	}
	public void setCity(String city) {
		empCity = city;
	}
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
		return "Employee [empId=" + empId + ", employeeName=" + employeeName + ", empCity=" + empCity + "]";
	}
	
}
