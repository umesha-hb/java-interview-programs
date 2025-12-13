package com.uttara.prime;

public class NthPrimeNumberExample {

	public static void main(String[] args)
	{
		int num=1, count=0, i;
		int n=100;
		while (count < n)  
		{ 
			num=num+1;
			for (i = 2; i <= num; i++)  
			{   
				if (num % i == 0)   
				{  
					break;  
				}  
			}  
			if (i == num)  
			{  
				System.out.println(num) ;
				count = count+1;  
			}  
		}  
		System.out.println("The " +n +"th prime number is: " + num);  

	}

}
