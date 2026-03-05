package com.utttara.arrays.duplicateInArray;

import java.util.Arrays;

public class RemoveDuplicateElementsInUnsortedArray {
	public static void removeDuplicateUsingSorting(int arr[]) {
		// Sort an unsorted array
		//Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++)
		{
			for (int j=0;j< arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int len = arr.length;
		int j = 0;
		// Traverse an array
		for (int i = 0; i < len - 1; i++)
		{
			// if value present at i and i+1 index is not equal
			if (arr[i] != arr[i + 1])
			{
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[len - 1];
		for (int k = 0; k < j; k++) {
			System.out.print(arr[k] + " ");
		}
	} 
	public static void main(String[] args) {
		int arr[] = { 5, 1, 2, 3, 6, 4, 4, 5, 6, 8, 7,8 };
		removeDuplicateUsingSorting(arr);
	}
}
