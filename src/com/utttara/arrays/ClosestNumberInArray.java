package com.utttara.arrays;

public class ClosestNumberInArray {
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
		int[] arr = {2, 5, 8, 12, 15};
		int target = 11;
		int result = findClosestNumber(arr, target);
		System.out.println("Closest number to " + target + " is " + result);
	}
}
/*
⏱ Time Complexity

Let:
n = arr.length
Loop Analysis
for (int num : arr)
This loop runs once for every element in the array.
Inside the loop:
Math.abs() → O(1)
Comparison → O(1)
Assignment → O(1)
So each iteration = constant time.

✅ Total Time Complexity:O(n)
Because we scan the array once.

📦 Space Complexity
Extra variables used:
int closest
int minDiff
int diff

Only a few integer variables.
No extra arrays or collections used.

✅ Space Complexity:
O(1)

(Constant space)

🎯 Final Answer
Complexity Type	Value
Time Complexity	O(n)
Space Complexity	O(1)
 */
