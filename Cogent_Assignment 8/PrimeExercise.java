package com.cogent.hw;

public class PrimeExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i = 2; i <=150; i++){
			boolean isPrime = true;

			for(int j = i-1; j > 1; j--)
			{
				if(i%j == 0)
					isPrime = false;
			}
			
			if(isPrime)
				System.out.println(i);
		}
	}

}
