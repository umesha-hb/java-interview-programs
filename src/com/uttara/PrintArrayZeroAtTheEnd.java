package com.uttara;


import java.util.Arrays;

public class PrintArrayZeroAtTheEnd {

	public static void main(String[] args) {
		int arr[] = {0,1,0,1,0,1,0,1};
		int count=0;
		int j=0;
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]==0)
			{
				count++;
			}else
			{
				arr[j++]=arr[i];
			}
		}
	
		while(count>0)
		{
			arr[j++]=0;
			count--;
		}
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	

		
	}
	

}
