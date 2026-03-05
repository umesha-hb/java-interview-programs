package com.utttara.arrays;

import java.util.ArrayList;
/*
Example 1:
Input: nums = [2, 3, -2, 4]
Output: 6
Explanation: The subarray [2, 3] yields the maximum product, which is 6.

2 mul=2
2 3 mul=6<-------------------------maximum product
2 3 -2 mul=-12
2 3 -2 4 mul=-48
3 mul=3
3 -2 mul=-6
3 -2 4 mul=-24
-2 mul=-2
-2 4 mul=-8
4 mul=4
Example 2:
Input: nums = [-2, 0, -1]
Output: 0
Explanation: Even though [-2, -1] multiplies to 2, it is not contiguous, so the maximum contiguous product is 0.
-2
 */
public class SubArrayMaxProduct {

    public static int maxProduct(int[] nums) {
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result   = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            // When current is negative, max & min swap roles
            if (current < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            maxSoFar = Math.max(current, maxSoFar * current);
            minSoFar = Math.min(current, minSoFar * current);

            result = Math.max(result, maxSoFar);
        }

        return result;
    }
    /*
    | Complexity Type  | Value    |
    | ---------------- | -------- |
    | Time Complexity  | **O(n)** |
    | Space Complexity | **O(1)** |

     */
    public static int maxProductUsingBruteForce(int[] nums) {
       int arr[] =nums;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                int mul = 1;

                for (int k = start; k <= end; k++) {
                    mul = mul * arr[k];
                    System.out.print(arr[k]+" ");

                }
                System.out.println("="+mul);
                al.add(mul);
            }
        }
        int max = al.stream().mapToInt(Integer::intValue).max().stream().findFirst().orElse(0);
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println(maxProduct(nums)); // 6

    }
}
