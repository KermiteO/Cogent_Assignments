package com.cognizant.shapes;

public class Rectangle {
	private double length;
	private double breadth;
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double width) {
		this.breadth = width;
	}
	
	String calculateArea() {
		return ("The Area of the rectangle is calculated using the formula length * breadth");
	}

}
