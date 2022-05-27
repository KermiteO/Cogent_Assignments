package com.cognizant.shapes;

public class Square extends Shapes{
	
	Square(int numSides)
	{
		super(numSides);
	}
	
	@Override
	public String calculateShapeArea(int numSides, int sideLength)
	{
		return ("The Area of the Square is " + sideLength*sideLength);
	}
}
