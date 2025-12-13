package com.uttara.sorting;

public class NewSorting {

	public static void main(String[] args) {
		A a= new B();
		((B) a).m2();
		int arr[] = {1,2,3,4,5,5,1,2,3,4};
		//sorting the array
		for(int i=0;i<arr.length;i++)
		{
			for (int j = i+1; j < arr.length; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		//remove duplicate elements 
		int[] temp = new int[arr.length];
		int j=0;
		for (int i = 0; i < arr.length-1; i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++]=arr[i];
			}
		}
		temp[j++] = arr[arr.length - 1];
	   for (int i = 0; i < j; i++)
		{
			System.out.print(temp[i]+" ");
		}
		
	}

}
class A
{
	void m1()
	{
		System.out.println();
	}
}
class B extends A
{
	void m1()
	{
		System.out.println();
	}
	void m2()
	{
		System.out.println();
	}
}