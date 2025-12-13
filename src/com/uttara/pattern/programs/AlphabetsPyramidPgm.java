package com.uttara.pattern.programs;

public class AlphabetsPyramidPgm {

	public static void main(String[] args) {
		int rows=10, i,j;
		char ch;
		for (i= 0; i <rows; i++)
		{
			ch='A';
			for (j= 0; j <=i; j++)
			{
				System.out.print(" "+ch++);
				
			}
			System.out.println();		
		}

	}

}
