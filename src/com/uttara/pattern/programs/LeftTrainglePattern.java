package com.uttara.pattern.programs;

public class LeftTrainglePattern {

	public static void main(String[] args)
	{
		int number=6;
		for (int i = 0; i < number; i++)
		{
			for (int j = number; j> i; j--)
			{
				System.out.print(" ");
			}
			for (int k=0; k<=i; k++ )   
			{   
				System.out.print("* ");   
			} 
			System.out.println();    
		}

	}

}
