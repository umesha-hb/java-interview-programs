package com.utttara.strings;

public class PermuteString {
	 static void printPermute(String str, String ans) {
	        if (str.length() == 0) {
	            System.out.print(ans + " ");
	            return;
	        }
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            String remaining  = str.substring(0, i) + str.substring(i + 1);
	            printPermute(remaining , ans + ch);
	        }
	    }
	    public static void main(String[] args) {//Number of permutations grows very fast (n!)
	        String s = "abc";
	        printPermute(s, "");
	    }
}