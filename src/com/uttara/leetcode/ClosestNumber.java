package com.uttara.leetcode;

public class ClosestNumber {
	public static int findClosestNumber(int[] arr, int target) {
		int closest = arr[0];
		int minDiff = Math.abs(target - closest);

		for (int num : arr) {
			int diff = Math.abs(target - num);
			if (diff < minDiff) {
				minDiff = diff;
				closest = num;
			}
		}
		return closest;
	}

	public static void main(String[] args) {
		int[] arr = {16, 5, 8, 2, 11};
		int target = 3;

		int result = findClosestNumber(arr, target);
		System.out.println("Closest number to " + target + " is " + result);
	}
}
