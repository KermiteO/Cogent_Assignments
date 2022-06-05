package com.cognizant.shapes;

public class Circle extends Shapes{

	private float radius;
	protected float pi;
	
	protected Circle(float radius)
	{
		this(radius,3.5f);
		this.setRadius(radius);
	}
	
	public Circle(float radius, float pi)
	{
		this.pi = pi;
		this.setRadius(radius);
	}
	
	
	public Circle() {
		super();
		setRadius(1.5f);
	}



	public float calculateCircleArea(float radius)
	{
		return pi*radius*radius;
				
	}
	
	public float calculateCircumference(float radius)
	{
		return 2*pi*radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle(2);
		
		System.out.println("The area of this circle is " + c1.calculateCircleArea(c1.getRadius()));
		System.out.println("The circumference of this circle is " + c1.calculateCircumference(c1.getRadius()));
	}
}
