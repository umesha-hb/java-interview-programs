package com.uttara.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BubbleSort {

	public void sort(int arr[], int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
 
	public static void main(String args[]) {
		
		
		int a[] = { 5, 1, 4, 2, 8, 1, 2,1 };
		Map<Integer,Long> m = Arrays.asList(5, 1, 4, 2, 8, 1, 2,1).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(m);
		int size = a.length;
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(a, size);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int b[] = bubbleSort.removeDuplicate(a, size);
		for (int i = 0; i < b.length; i++) {
//			System.out.print(b[i]+" ");
		}
		
	}

	private int[] removeDuplicate(int[] a, int n) {

		int j = 0;

		for (int i = 0; i < n-1 ; i++) {

			if (a[i] != a[i + 1]) {
				a[j] = a[i];
				j++;

			}

		}
		a[j++] = a[n - 1];
		int sortedArray[] = new int[j];
		for (int i = 0; i < sortedArray.length; i++)
		{
			sortedArray[i]=a[i];
		}
		
		return sortedArray;
	}
}
