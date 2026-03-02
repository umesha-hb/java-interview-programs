package com.utttara.arrays;

public class FindMinConsecutiveOnesArray {

    public static int findMinConsecutiveOnes(int[] arr) {
        int count = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 1)
                count++;
         else{
                min = Math.min(min, count);
                count = 0;
            }
        }
        // Handle case where array ends with 1s
       if(count > 0){
            min = Math.min(min, count);
        }
        return min ;
    }

    public static void main(String[] args) {

        int[] arr = {1,1,0,1,1,1,0,1};
        System.out.println(findMinConsecutiveOnes(arr)); // Output: 1
    }
}

