package com.uttara.luxoft.scb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstNonRepeatedCharThird 
{

    public static void main(String[] args)
    {
    	 List<Character> nonRepeatingChars = new ArrayList<>();
    	 Set<Character> repeatingChars = new HashSet<>();
    	 String s = "teeter";
    	 char[] ch = s.toCharArray();
    	 for (int i = 0; i < ch.length; i++)
    	 {
    		 char letter = s.charAt(i);
    		 if(repeatingChars.contains(letter))
                 continue;
    		 if(nonRepeatingChars.contains(letter))
    		 {
    			 nonRepeatingChars.remove((Character) letter);
    			  repeatingChars.add(letter);
    		 }
    		 else
    		 {
    			 nonRepeatingChars.add(letter);
    		 }
			
		 }
    	 System.out.println(nonRepeatingChars.get(0));
    }
}
