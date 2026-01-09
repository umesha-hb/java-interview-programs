package com.utttara.arrays;

public class ClosestNumberInArray {
	public static int findClosestNumber(int[] arr, int target) {
		int closest = arr[0];//take first element as closet
		int minDiff = Math.abs(target - closest);//differentiate target element with closet element and
		//Math abs it will return (a < 0) ? -a : a
System.out.println("minDiff = "+minDiff);
		for (int num : arr) {// iterate array
			int diff = Math.abs(target - num);
			if (diff < minDiff) {//if inside loop difference is less
				// then change minDiff to loop diff and closet to numm
				minDiff = diff;
				closest = num;
			}
		}
		return closest;
	}

	public static void main(String[] args) {
		int[] arr = {2, 5, 8, 12, 15};
		int target = 10;

		int result = findClosestNumber(arr, target);
		System.out.println("Closest number to " + target + " is " + result);
	}
}
