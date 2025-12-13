package com.uttara.java8.tcs;

public class ConvertStringToInteger {

	public static void main(String[] args) {
		String s1="Bangalore";
		String s2="Bangalore";
		s2.concat("Hyderbad");
		System.out.println(s1==s2);
		String a = "Bangalore";
		String b = "Bangalore";
		String c = new String(a);
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a==c);
		System.out.println(a.equals(c));
//		convert("234");
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
