package com.uttara;

public class SecondSmallestInArrayExample {

	public static void main(String[] args) 
	{
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("Second smallest: "+getSecondSmallest(a,6));
		System.out.println("Second smallest: "+getSecondSmallest(b,7));

	}
	public static int getSecondSmallest(int[] a, int total){  

		for (int i = 0; i < total; i++)   
		        {  
		            for (int j =0; j < total-1; j++)
		            {  
		                if (a[j] > a[j+1])
		                {
							int temp = a[j+1];
		                    a[j] = a[j+1];
		                    a[j+1] = temp;
		                }  
		            }  
		        }  
		       return a[1];//2nd element because index starts from 0  
		}
}
