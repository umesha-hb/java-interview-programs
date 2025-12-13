package com.uttara.string.programs;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CombineCharacterAndNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="123";
		String str2="abc";
		char[] ch1=str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		String str3 = "";
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ch1.length; i++) 
		{
			sb.append(str1.charAt(i));
			sb.append(str2.charAt(i));
			
		}
		str3 = sb.toString();
	    System.out.println(str3);
	    String str4="1a2b3c";
	    String s5="";
	    String s6="";
	    for (int i = 0; i < str4.length(); i++) {
	    	if(Character.isDigit(str4.charAt(i)))
	    		s5=s5+str4.charAt(i);
	    	else
	    		s6=s6+str4.charAt(i);
	    	
			
		}

	   System.out.println(s5.concat(s6));
	    

	}

}
