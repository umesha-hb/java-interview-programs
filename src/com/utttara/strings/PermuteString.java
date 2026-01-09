package com.utttara.strings;

public class PermuteString {

	 static void printPermute(String str, String ans) {

	        // If string is empty
	        if (str.length() == 0) {
	            System.out.print(ans + " ");
	            return;
	        }

	        for (int i = 0; i < str.length(); i++) {

	            // ith character of str
	            char ch = str.charAt(i);

	            // Rest of the string after excluding the ith character
	            String remaining  = str.substring(0, i) + str.substring(i + 1);

	            // Recurvise call
	            printPermute(remaining , ans + ch);
	        }
	    }

	    // Driver code
	    public
	    static void main(String[] args) {//Number of permutations grows very fast (n!)
	        String s = "abc";
	        printPermute(s, "");
	    }
}