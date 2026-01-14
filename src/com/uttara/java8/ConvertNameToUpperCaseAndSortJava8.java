package com.uttara.java8;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertNameToUpperCaseAndSortJava8
{

	public static void main(String[] args) 
	{
		
		  HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		  hashMap.put(1,"manish"); 
		  hashMap.put(2,"umesha");
		  hashMap.put(3,"Ritesh");
		  List<String> al = hashMap.entrySet().stream().map(e->e.getValue().toUpperCase()).
				  sorted(String::compareTo).collect(Collectors.toList()); 
		  System.out.println(al);
		
	}

}
