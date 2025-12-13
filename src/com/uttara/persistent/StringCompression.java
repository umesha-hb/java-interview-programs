package com.uttara.persistent;

import java.util.Iterator;

public class StringCompression {

	public static void main(String[] args) {
		String s = "aaaaabbbabbbccc";//4a6b3c
		char[] ch= s.toCharArray();
		StringBuilder sb = new StringBuilder();
		int count=1;
		 for (int i = 1; i < s.length()-1 ; i++) 
	        {
	          if (s.charAt(i) == s.charAt(i -1)) 
	          {
	            count++;
	          } 
	          else 
	          {
	            sb.append(s.charAt(i - 1));
	            sb.append(count);
	            count = 1;
	          }
	        }
		//Count the last character of the string
	      if (s.length() > 1)
	        {
	        //Compare the last two characters of the string
	        if (s.charAt(s.length() - 1) == s.charAt(s.length() - 2))
	          {
	            count++;
	          } 
	          else 
	          {
	            sb.append(s.charAt(s.length() - 2));
	            sb.append(count);
	            count = 1;
	          }
	          sb.append(s.charAt(s.length() - 1));
	          sb.append(count);
	        }
	        s = sb.toString();
	        System.out.println("The compressed string along with the counts of repeated characters is:" + "\n" +s);
	}

}
