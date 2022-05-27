package com.cognizant.shapes;

public class Circle extends Shapes{

	Circle(int numSides)
	{
		super(numSides);
	}
	
	@Override
	public String calculateShapeArea(int numSides, int radius)
	{
		return ("The Area of the Circle is " + 3.14*radius*radius);
				
	}
}
