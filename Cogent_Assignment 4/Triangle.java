package com.cognizant.shapes;

public class Triangle extends Shapes{
	
	Triangle(int numSides)
	{
		super(numSides);
	}
	
	@Override
	public String calculateShapeArea(int numSides, int sideLength)
	{
		return ("The Area of the Triangle is " + 0.433*sideLength*sideLength);
	}
}
