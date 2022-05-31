package com.cogent.hw;

import java.util.Scanner;

public class UserInputExercise {

	static final String menu = "Enter Option:\n"	
							   + "\tAdd-1\n"
							   + "\tSubtract-2\n"
							   + "\tMultiply-3\n"
							   + "\tQuit-4";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int menuChoice;
		int num1;
		int num2;
		
		System.out.println(menu);
		menuChoice = input.nextInt();
		
		while(menuChoice != 4)
		{
			switch(menuChoice)
			{
			case 1: System.out.println("Enter two numbers to be added");
					System.out.print("Enter first number: ");
					num1 = input.nextInt();
					input.nextLine();
					System.out.print("Enter second number: ");
					num2 = input.nextInt();
					input.nextLine();
					System.out.println();
					int sum = num1 + num2;
					System.out.println("The result is " + sum + "\n");
				break;
			case 2: System.out.println("Enter two numbers to be subtracted");
					System.out.print("Enter first number: ");
					num1 = input.nextInt();
					input.nextLine();
					System.out.print("Enter second number: ");
					num2 = input.nextInt();
					input.nextLine();
					System.out.println();
					int difference = num1 - num2;
					System.out.println("The result is " + difference + "\n");
				break;
			case 3: System.out.println("Enter two numbers to be multiplied");
					System.out.print("Enter first number: ");
					num1 = input.nextInt();
					input.nextLine();
					System.out.print("Enter second number: ");
					num2 = input.nextInt();
					input.nextLine();
					System.out.println();
					int product = num1 * num2;
					System.out.println("The result is " + product + "\n");
				break;
			case 4: input.close();
				break;
			}
			System.out.println(menu);
			menuChoice = input.nextInt();
		}
		
	}
	

}
