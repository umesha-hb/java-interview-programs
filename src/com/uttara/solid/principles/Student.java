package com.uttara.solid.principles;

//Single Responsibility Principle
//public class Student
//{
//	public void printDetails()  
//	{  
//	//functionality of the method  
//	}  
//	public void calculatePercentage()  
//	{  
//	//functionality of the method  
//	}  
//	public void addStudent() 
//	{  
//	//functionality of the method  
//	}  
//}
/**
 * The above code snippet violates the single responsibility principle. To
 * achieve the goal of the principle, we should implement a separate class that
 * performs a single functionality only.
 */
class Student {
	public void addStudent()
	{
//functionality of the method  
	}
}

class PrintStudentDetails
{
	public void printDetails()
	{
		// functionality of the method
	}
}

class Percentage
{
	public void calculatePercentage()
	{
		// functionality of the method
	}
}