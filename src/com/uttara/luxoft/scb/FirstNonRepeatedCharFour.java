package com.uttara.luxoft.scb;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharFour {

	 public static Character findFirstNonRepeatableChar(String str) {
	        Map<Character,Integer> map = new LinkedHashMap<>();
	        for (Character ch : str.toCharArray()) {
	            map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
	        }
	        return map.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
	} 
	    

	    public static void main(String[] args)
	    {
	        String s = "hello";
	        char ch = findFirstNonRepeatableChar(s);
	        System.out.println( ch);
	    }

}
