package com.uttara.pattern.programs;

public class DaimondShapePattern
{
	public static void main(String[] args)
	{
		int number=6,i,j,k;
		for ( i = 0; i < number; i++)
		{
			for ( j = number; j> i; j--)
			{
				System.out.print(" ");
			}
			for ( k=0; k<=i; k++ )   
			{   
				System.out.print("* ");   
			} 
			System.out.println();   
		}
		for (i = 0; i <number; i++)
		{
			System.out.print("* ");
		  
		} 
		System.out.println(); 
	}
}
