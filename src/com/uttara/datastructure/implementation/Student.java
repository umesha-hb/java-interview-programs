package com.uttara.datastructure.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;




public class Student
{
	private String name;
	

	private int age;
	private String fristName;
	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", fristName=" + fristName + "]";
	}
	
 public static void main(String args[]) 
 {
	 
		/*
		 * Student s1 = new Student(); s1.setAge(60); s1.setName("A");
		 * 
		 * Student s2 = new Student(); s2.setAge(40); s2.setName("B"); Student s3 = new
		 * Student(); s2.setAge(60); s2.setName("C"); List<Student> list = new
		 * ArrayList<Student>(); list.add(s1); list.add(s2); list.add(s3);
		 * Stream<Student> filteredStream = list.stream().filter(e -> e.getAge()>50);
		 * filteredStream.forEach(System.out :: println);
		 */
		
		
		  int arr[]= {2,4,3,7,6,0,-4,9,8,3,1,6};
		  int target =9; 
/*		  Map<Integer,Integer>
		  map = findPairs(arr,target);
		  map.entrySet().forEach(e ->
		  System.out.println(arr[e.getKey()] + " " +arr[e.getValue()]));*/
		  
		  Map<Integer,Integer> m = new HashMap<Integer, Integer>();
			for(int i=0;i<arr.length-1;i++)
			{
				for (int j = 1; j < arr.length-1-i; j++) 
				{
					if(arr[i]+arr[j]==target)
					{
						if(!m.containsKey(arr[i]))
						{
							m.put(i, j);
						}
					}
				}
			}
			m.entrySet().forEach(e -> System.out.println(arr[e.getKey()] + " " +arr[e.getValue()]));
		 
 }

private static Map findPairs(int[] arr,int target)
{
	Map<Integer,Integer> m = new HashMap<Integer, Integer>();
	for(int i=0;i<arr.length-1;i++)
	{
		for (int j = 1; j < arr.length-1-i; j++) 
		{
			if(arr[i]+arr[j]==target)
			{
				if(!m.containsKey(arr[i]))
				{
					m.put(i, j);
				}
			
				
			}
		}
		
	}
	return m;
	

	
}
}
/**
 * 
 */
