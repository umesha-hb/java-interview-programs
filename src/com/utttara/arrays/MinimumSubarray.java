package com.utttara.arrays;

import java.util.ArrayList;

public class MinimumSubarray {

    public static int minSubArray(int[] nums) {
        int minSoFar = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMin = Math.min(nums[i], currentMin + nums[i]);
            minSoFar = Math.min(minSoFar, currentMin);
        }

        return minSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println(minSubArray(nums)); // -6
    }

}
    /*
    Example:
        nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

        Initialization
                maxSoFar = -2
        currentMax = -2

        Iteration Trace

| i | nums[i] | currentMin = min(nums[i], currentMin + nums[i]) | minSoFar |
| - | ------- | ----------------------------------------------- | -------- |
| 0 | -2      | -2                                              | -2       |
| 1 | 1       | min(1, -2+1 = -1) = -1                          | min(-2,-1)=-2      |
| 2 | -3      | min(-3, -1-3 = -4) = -4                         | min(-2,-4)=-4     |       |
| 3 | 4       | min(4, -4+4 = 0) = 0                            | min(-4,0)=-4       |
| 4 | -1      | min(-1, 0-1 = -1) = -1                          | min(-4,-1)=-4       |
| 5 | 2       | min(2, -1+2 = 1) = 1                            | min(-4,1)=-4        |
| 6 | 1       | min(1, 1+1 = 2) = 1                             | min(-4,1)=-4        |
| 7 | -5      | min(-5, 1-5 = -4) = -5                          | min(-4,-5)=-5      |
| 8 | 4       | min(4, -5+4 = -1) = -1                          | min(-5,-1)=-5        |

    */

