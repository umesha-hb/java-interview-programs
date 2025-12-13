package com.uttara.string.techchefs;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfCharcterInAGivenString
{

	public static void main(String[] args) 
	{
		CountNumberOfCharcterInAGivenString.usingHashMap("aaaab");
        System.out.println(CountNumberOfCharcterInAGivenString.usingToCharArray("India Is My Country") + " words.");  
        System.out.println(CountNumberOfCharcterInAGivenString.toggelString("India Is My Country"));
      CountNumberOfCharcterInAGivenString.findDuplicateCharactersInAString("India");

	}
    private static void findDuplicateCharactersInAString(String str) {
		 Map<Character, Integer> result = new HashMap<>();
		 String orignalString=str.toLowerCase();
		for (int i = 0; i < orignalString.length(); i++) 
		{
			 char ch = orignalString.charAt(i);
			 Integer count = result.get(ch);
			  if (count != null)
			  { 
				  result.put(ch, ++count);
			  }
			  else
			  {
				  result.put(ch, 1);
			  }
		}
		result.entrySet().stream().forEach(e ->System.out.println(e.getKey() + ":"+e.getValue()));
	}
	private static int usingToCharArray(String s) {
    	String toUpperCaseString = s.toUpperCase();
    	char [] ch = toUpperCaseString.toCharArray();
    	int count = 0;
    	for (int i = 0; i < ch.length; i++) 
    	{
    		  ch[i]= toUpperCaseString.charAt(i);  
              if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                  count++;  
		}
    	return count;
		
	}
	public  static void usingHashMap(String s)
    {
    	String toUpperCaseString = s.toUpperCase();
    	Map<Character, Integer> map = new HashMap<Character, Integer>();
    	for (int i = 0; i < s.length(); i++)
    	{
    		if(map.containsKey(toUpperCaseString.charAt(i)))
    		{
    			map.put(toUpperCaseString.charAt(i), map.get(toUpperCaseString.charAt(i))+1);
    		}
    		else
    		{
    			map.put(toUpperCaseString.charAt(i), 1);
    		}
		}
    	map.entrySet().stream().forEach(e -> System.out.println(e.getKey() +":"+ e.getValue()));
    }
	public static String toggelString(String s)
	{
		String toggledString ="";
		String orginalString = s;
		String[] word = orginalString.split(" ");
		for (int i = 0; i < word.length; i++) {
			String first = word[i].substring(0, 1);
			String afterFirst = word[i].substring(1);
			toggledString = toggledString + first.toLowerCase() + afterFirst.toUpperCase()+ " ";
		}
		return toggledString;
	}
}
