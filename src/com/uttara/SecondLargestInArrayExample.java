package com.uttara;

public class SecondLargestInArrayExample {

	public static void main(String[] args) {




//		int b[]={1,2,5,6,13,22};  
		int a[]={44,66,99,77,33,22,55};  
//		System.out.println("Second Largest: "+getSecondLargest(b));
//		System.out.println("Second Largest: "+getSecondLargest(b,7)); 
		
		int fristlargest=0;
		int secondlargest=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				fristlargest =a[i+1];
				
			}
			else
			{
				secondlargest =a[i];
			
			}
		}
		System.out.println("Second Largest: "+secondlargest);

	}
	public static int getSecondLargest(int[] a){  
		int temp;  
		for (int i = 0; i < a.length; i++)   
		        {  
		            for (int j = i+1; j < a.length; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[a.length-2];  
		}  
}
