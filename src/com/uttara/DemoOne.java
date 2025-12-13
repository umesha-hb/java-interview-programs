package com.uttara;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

import java.util.stream.Collectors;

public class DemoOne {

	public static void main(String[] args) 
	{
		String s = "sapsplause";
		Map<String,Long> map = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
//		System.out.println(map);
		String s1 = map.entrySet().stream().filter(e->e.getValue()==1).findFirst().get().getKey();
		System.out.println(s1);
	Entry<String, Long> max = map.entrySet().stream().max((e1,e2)->e1.getValue()>e2.getValue()?1:-1).get();
	System.out.println("-------------Maximum Number of occurenceof Character in String------------"+s);	
	System.out.println(max.getKey() +" : "+max.getValue());
//		
	System.out.println("-------------multiply each elements in List with 5------------");	
	List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.stream().map(i->i*5).forEach(System.out::println);
//	
			 String str= "Communication";  
		 Map<String, Long> result = Arrays.stream(str.split("")).
				 map(String::toLowerCase).
				 collect(Collectors.groupingBy(Function.identity(),  Collectors.counting())); 
		 System.out.println("-------------Count Number of occurenceof Character in String------------"+str);		
		 System.out.println(result);
			System.out.println("-------------Least occurenceof Character in String------------"+str);	
		 System.out.println(result.entrySet().stream().filter(e ->e.getValue()==1).findFirst().get());
//		 
//		 
		List<Integer> myList = Arrays.asList(10,10,15,8,49,25,98,98,32,15,10);
		System.out.println("-------------Count Number of elements in List------------");
     long count =  myList.stream()
               .count();
 System.out.println(count); 
 System.out.println("-------------Maximum Number in List------------");
		 int maximumNumber = myList.stream().max(Integer::compare).get();
	 System.out.println(maximumNumber);
	 System.out.println("-------------Minmum Number in List------------");
		 int minNumber = myList.stream().min(Integer::compare).get();
	 System.out.println(minNumber);
	 System.out.println("-------------duplicate Elements in List------------");
	       Set<Integer> set = new HashSet<Integer>();
            myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);
            
            
            Map<String,String> map1=new HashMap<String,String>();
            map1.put("virat", "Kohli");
     	  map1.put("virat", "anil");
            map1.put("virat", "Rechards");
            map1.entrySet().stream().filter(e->e.getKey().startsWith(e.getKey().toLowerCase())).forEach(System.out::println);




	}

}
