package com.utttara.arrays;

public class FindMaxConsecutiveOnesArray {
    public static int findMaxConsecutiveOnes(int[] arr) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 1){
                count++;
                max = Math.max(max, count);

            }else{
                count = 0;
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        /*
       Given a binary array nums, return the maximum number of consecutive 1's in the array.
        Input: nums = [1,1,0,1,1,1]
         */
        int[] a= {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(a));
    }

}
