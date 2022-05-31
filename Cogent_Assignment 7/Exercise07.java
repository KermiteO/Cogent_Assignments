package com.cogent.hw;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Problem 1");
		for(int i = 1; i <= 200; i++)
		{
			if(i % 2 == 1)
				System.out.print(i);
			else
				System.out.print(",");
		}
		
		System.out.println("\n\nProblem 2");
		for(int i = 1; i <= 6; i++)
		{			
			for(int j = 1; j < i+1; j++)
			{			
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for(int i = 5; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}
