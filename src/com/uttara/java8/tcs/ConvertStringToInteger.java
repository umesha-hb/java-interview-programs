package com.uttara.java8.tcs;

public class ConvertStringToInteger {

	public static void main(String[] args) {

		convert("234");
	}
	public static void convert(String s) 
	{ 
	      
	    // Initialize a variable 
	    int num = 0; 
	    int n = s.length(); 
	  
	    // Iterate till length of the string 
	    for(int i = 0; i < n; i++) {
	  
	        // Subtract 48 from the current digit 
	        num = num * 10 + ((int)s.charAt(i)-48);
	    }
	    // Print the answer 
	    System.out.print(num);
	    System.out.println();
	} 
}
