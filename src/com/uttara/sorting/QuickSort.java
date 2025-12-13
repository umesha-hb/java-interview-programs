package com.uttara.sorting;

class Dog {
	int size;
}

public class QuickSort {

	public static void main(String[] args) {
		/*
		 * Dog d=new Dog();
		 * 
		 * d.size=10; System.out.println(d.size); Dog d1=d; d1.size=100;
		 * System.out.println(d1.size); System.out.println(d.size);
		 */
		
		  int arr[] = { 7,6,10,5, 9, 2, 1,15,7};
		  
		  QuickSort quickSort = new QuickSort();
		  
		  quickSort.sort(arr, 0, arr.length - 1);
		  
		  
		  for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }
		 
	}

	public void sort(int[] a, int lb, int ub) {
		if (ub - lb < 1) {
			return;
		}
		int loc = partition(a, lb, ub);
		sort(a, lb, loc - 1);
		sort(a, loc + 1, ub);
	}

	int partition(int[] a, int lb, int ub) {
		int start = lb;
		int end = ub;
		int pivot = a[lb];

		while (start < end) {
			while (a[start] <= pivot) {
				start++;
			}
			while (a[end] > pivot) {
				end--;
			}
			if (start < end) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
		}

		// swap pivot to the new position

		int temp = a[end];
		a[end] = pivot;
		a[lb] = temp;

		return end;
	}

}