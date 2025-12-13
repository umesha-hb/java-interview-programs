package com.uttara;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in); // Getting the input string from  the user
		  System.out.print("Enter the First String : "); 
		  String s1 = scanner.nextLine();
		  
		  System.out.print("Enter the second String : ");
		  String s2 =  scanner.nextLine();
		  
		  
		  if(checkAnagram(s1, s2))
			  System.out.println(s1+" and "+s2+" are Anagrams");
		  else
			  System.out.println(s1+" and "+s2+" are NOT Anagrams");
		  
		  scanner.close(); 
		 
		

	}

	/**
	 * An anagram of a string is another string that contains the same characters, 
	 * only the order of characters can be different. 
	 * For example, �abcd� and �dabc� are an anagram of each other.22-Sept-2
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static boolean checkAnagram(String s1, String s2) {
		// Remove all the white space
		if (s1.length() != s2.length())
			return false;
		else {
			char[] arr1 = s1.toLowerCase().toCharArray();
			char[] arr2 = s2.toLowerCase().toCharArray();
			// Sort both Character Array
			Arrays.sort(arr1);
			Arrays.sort(arr2);

			// Check if both arrays are equal
			return (Arrays.equals(arr1, arr2));
		}
	}
}
/*
 * select max(salary) from employee order by id desc;
 */
