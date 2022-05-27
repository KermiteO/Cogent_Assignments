package com.cognizant.shapes;

public class Shapes {
	private int numberOfSides;
	
	Shapes(){}
	Shapes(int numSides)
	{
		this.numberOfSides = numSides;
	}
	public String calculateShapeArea(int numSides, int sideLength) {
		Shapes theShape = null;
		
		if(numSides==1)
			theShape = new Circle(numSides);
		else if(numSides==3)
			theShape = new Triangle(numSides);
		else if(numSides==4)
			theShape = new Square(numSides);
		else
			return "No Shapes Present";
		
		return theShape.calculateShapeArea(numSides, sideLength);
	}

	public int getNumberOfSides() {
		return numberOfSides;
	}

	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}
	
	public static void main(String[] args) {
		System.out.println(new Shapes().calculateShapeArea(4,15));
	}
}
