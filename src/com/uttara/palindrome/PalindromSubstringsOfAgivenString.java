package com.uttara.palindrome;

public class PalindromSubstringsOfAgivenString {

	public static void main(String[] args) {
		// Custom input string
        String str = "aba";
 
        int count = 0;
 
        // Outer loop iterating over input string
        for (int i = 0; i < str.length(); i++) {
 
            // Inner loop iterating from current starting
            // character of outer loop current starting
            // character
            for (int j = i; j < str.length(); j++) {
 
                // Getting the substrings
                String subString = str.substring(i, j + 1);
 
                // Checking whether the substring is
                // palindrome
                if (checkPlaindrome(subString)) {
 
                    // Increment the count only if
                    // substring is palindrome
                    count++;
                }
            }
        }
        System.out.println(
                "No.of palindromic substrings in the given string are "
                + count);
	}
 public static boolean checkPlaindrome(String str)
 {
	 String reverse="";
		for (int k = 0; k < str.length(); k++) {
			reverse = reverse+ str.charAt(k);
		}
		if(reverse.equals(str))
		{
			System.out.println(str);
			return true;
		}
		return false;
 }
}
