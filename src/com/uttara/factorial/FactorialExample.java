package com.uttara.factorial;

import java.util.stream.IntStream;

public class FactorialExample {

	public static void main(String args[]){  
		  int i,fact=1;  
		  int number=5;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);
		int factorial = IntStream.rangeClosed(1, 10)
				.reduce(1, (a, b) -> a * b);
		System.out.println("Factorial of " + 10 + " is: " + factorial);
	}

}
