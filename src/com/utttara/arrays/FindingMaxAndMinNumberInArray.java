package com.utttara.arrays;

public class FindingMaxAndMinNumberInArray {
    public static void main(String[] args)
    {

        int arr[] = {10,99,12,55,3,44,103,-2};
        int max = arr[0];
        int min = Integer.MAX_VALUE;
        System.out.println("max value "+max+" min value : "+min);
        for (int i=0;i< arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println("max value in array "+max+" min value in array: "+min);
    }
}
/*
⏱ Complexity

Time Complexity → O(n) (single loop)

Space Complexity → O(1) (only two variables)
 */