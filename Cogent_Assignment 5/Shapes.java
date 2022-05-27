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
		
		switch(numSides)
		{
		case 1: theShape = new Circle(numSides);
			break;
		case 3: theShape = new Triangle(numSides);
			break;
		case 4: theShape = new Square(numSides);
			break;
		default: return "No Shapes Present";
		}
				
		return theShape.calculateShapeArea(numSides, sideLength);
	}

	public int getNumberOfSides() {
		return numberOfSides;
	}

	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}
	
	public static void main(String[] args) {
		System.out.println(new Shapes().calculateShapeArea(5,15));
	}
}
