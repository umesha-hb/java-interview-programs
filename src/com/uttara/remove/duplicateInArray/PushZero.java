package com.uttara.remove.duplicateInArray;

public class PushZero {

	public static void main(String[] args) {
		int arr [] = {0,0,0,1,1,0,1,0,1};
		int count = 0;
		for (int i = 0; i < arr.length; i++)
		{
			
			if(arr[i]==0)
			{
				arr[count]=arr[i];
				count = count+1;
			}

		}
		while (count < arr.length)
	        arr[count++] = 1;
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
