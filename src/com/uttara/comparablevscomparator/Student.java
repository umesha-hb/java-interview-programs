package com.uttara.comparablevscomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student>
{
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name ,int age)
	{
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	@Override
	public int compareTo(Student o) {
		if(this.rollno == o.getRollno())
		{
			return 0;
		}
		else if(this.rollno > o.getRollno())
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}
	public static void main(String args[])
	{
		Student student1 = new Student(101,"Vijay",23);
		Student student2 = new Student(106,"Ajay",27);
		Student student3 = new Student(105,"Jai",21);
		List<Student> stList = new ArrayList<Student>();
		stList.add(student1);
		stList.add(student2);
		stList.add(student3);
		Collections.sort(stList);
		stList.forEach(e -> System.out.println(e.rollno +" "+e.getName()+ " "+e.getAge()));
		System.out.println("-------------");
		Collections.sort(stList,new AgeComparator());
		stList.forEach(e -> System.out.println(e.rollno +" "+e.getName()+ " "+e.getAge()));
	}
}
class NameComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2)
	{
		return o1.getName().compareTo(o2.getName());
	}
	
}
class AgeComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getAge()==o2.getAge())
		{
			return 0;
		}
		else if(o1.getAge() > o2.getAge())
		{
			return 1;
		}
		else 
		{
			return -1;
		}
	}
	
}
class RollNumberComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) 
	{
		if(o1.getRollno()==o2.getRollno())
		{
			return 0;
		}
		else if(o1.getRollno() > o2.getRollno())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}