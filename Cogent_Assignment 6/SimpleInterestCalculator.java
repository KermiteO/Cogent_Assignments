package com.cogent.hw;

public class SimpleInterestCalculator {
	private double principleAmount;
	private int	   numberOfYears;
	private double interestRate;
	
	SimpleInterestCalculator(double principleAmount,
							 int	numberOfYears)
	{
		setPrincipleAmount(principleAmount);
		setNumberOfYears(numberOfYears);
		setInterestRate(0);
	}
	public double getPrincipleAmount() {
		return principleAmount;
	}
	public void setPrincipleAmount(double principleAmount) {
		this.principleAmount = principleAmount;
	}
	public int getNumberOfYears() {
		return numberOfYears;
	}
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void calculateSimpleInterest()
	{	
		if(principleAmount > 100000)
		{
			if(numberOfYears > 10)
				interestRate = (principleAmount*numberOfYears*10)/100;
			else
				interestRate = (principleAmount*numberOfYears*(9.5))/100;	
		}
		else 
		{
			if(numberOfYears > 10)
				interestRate = (principleAmount*numberOfYears*5)/100;
			else
				interestRate = (principleAmount*numberOfYears*4.5)/100;
		}
		
		System.out.println("The interest amount for a principal of " 
						   + (int)principleAmount + " and years " + numberOfYears
						   + " is " + (int)interestRate);
	}
	
	public static void main(String[] args) {
		SimpleInterestCalculator sic = new SimpleInterestCalculator(50000,5);
		
		sic.calculateSimpleInterest();
	}
}
