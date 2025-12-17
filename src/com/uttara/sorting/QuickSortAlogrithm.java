package com.uttara.sorting;



public class QuickSortAlogrithm {

	public static void main(String[] args) {

		  int arr[] = { 7,6,10,5, 9, 2, 1,15,7};

		  QuickSortAlogrithm quickSortAlogrithm = new QuickSortAlogrithm();

		quickSortAlogrithm.quickSort(arr, 0, arr.length - 1);


		  for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }

	}

	public void quickSort(int[] a, int low, int high) {
		if (high - low < 1) {
			return;
		}
		int pivotIndex  = partition(a, low, high);
		quickSort(a, low, pivotIndex  - 1);
		quickSort(a, pivotIndex  + 1, high);
	}

	int partition(int[] a, int low, int high) {
		int start = low;
		int end = high;
		int pivot = a[low];

		while ( start < end) {
			while (start <= high && a[start] <= pivot) {
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
		a[low] = temp;

		return end;
	}

}