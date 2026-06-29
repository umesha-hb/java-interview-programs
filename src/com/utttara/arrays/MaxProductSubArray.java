package com.utttara.arrays;

import java.util.ArrayList;

public class MaxProductSubArray {

    /*
    The code you posted solves the Maximum Product Subarray problem
    using a Dynamic Programming (DP) approach optimized to O(1) space.

    More specifically, it is often called:

    Kadane-style Dynamic Programming for Product Subarray.
     */
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

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxProduct(nums)); // 960

    }
}
    /*
 Example:
     nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

   maxSoFar = -2
minSoFar = -2
result   = -2

     Iteration Trace

| i | nums[i] | Swap? | maxSoFar                                           | minSoFar                 | result |
| - | ------- | ----- | -------------------------------------------------- | ------------------------ | ------ |
| 0 | -2      | —     | -2                                                 | -2                       | -2     |
| 1 | 1       | No    | max(1, -2×1 = -2) = 1                              | min(1, -2×1 = -2) = -2   | 1      |
| 2 | -3      | Yes   | (swap → max=-2, min=1) → max(-3, -2×-3=6)=6        | min(-3, 1×-3=-3) = -3    | 6      |
| 3 | 4       | No    | max(4, 6×4=24)=24                                  | min(4, -3×4=-12)=-12     | 24     |
| 4 | -1      | Yes   | (swap → max=-12, min=24) → max(-1, -12×-1=12)=12   | min(-1, 24×-1=-24)=-24   | 24     |
| 5 | 2       | No    | max(2, 12×2=24)=24                                 | min(2, -24×2=-48)=-48    | 24     |
| 6 | 1       | No    | max(1, 24×1=24)=24                                 | min(1, -48×1=-48)=-48    | 24     |
| 7 | -5      | Yes   | (swap → max=-48, min=24) → max(-5, -48×-5=240)=240 | min(-5, 24×-5=-120)=-120 | 240    |
| 8 | 4       | No    | max(4, 240×4=960)=960                              | min(4, -120×4=-480)=-480 | 960    |


 */

    /*
    | Complexity Type  | Value    |
    | ---------------- | -------- |
    | Time Complexity  | **O(n)** |
    | Space Complexity | **O(1)** |

     */

