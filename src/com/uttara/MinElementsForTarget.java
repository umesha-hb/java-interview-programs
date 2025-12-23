package com.uttara;
import java.util.Arrays;

//Sort the array in descending order
//
//        Pick the largest elements first
//
//        Keep adding until:
//
//        Sum == target → return count
//
//        Sum > target or array exhausted → return -1
public class MinElementsForTarget {

    public static int minElements(int[] arr, int target) {
        Arrays.sort(arr);  // sort ascending

        int sum = 0;
        int count = 0;

        // traverse from largest to smallest
        for (int i = arr.length - 1; i >= 0; i--) {
            if (sum + arr[i] <= target) {
                System.out.print(i+" ");
                sum += arr[i];
                count++;
            }
            if (sum == target) {
                return count;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5};

     System.out.println(minElements(arr, 6));   // Output: 2

//       System.out.println(minElements(arr, 1));  // Output: -1
    }
}
