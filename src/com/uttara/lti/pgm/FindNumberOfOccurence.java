package com.uttara.lti.pgm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindNumberOfOccurence {

	public static void main(String[] args) {
		String str = "My Name is Sachin and Sachin playing cricket for india";
		String[] s = str.split(" ");
		
		Map<String,Integer> hs = new HashMap<String,Integer>();
		for(int i =0;i<s.length;i++)
		{
		    if(hs.containsKey(s[i]))
		         hs.put(s[i],hs.get(s[i])+1);
		    else
		    hs.put(s[i],1);
		} 
		hs.entrySet().stream().forEach(System.out::println);
		
		Map<String,Long> h1 = 	Arrays.stream(s).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		Arrays.stream(s).filter(e -> h1.get(e)>1).collect(Collectors.toList());
 System.out.println(Arrays.stream(s).filter(e -> h1.get(e)>1).collect(Collectors.toList()));
	}

}
