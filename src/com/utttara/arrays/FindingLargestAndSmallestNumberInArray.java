package com.utttara.arrays;

public class FindingLargestAndSmallestNumberInArray {
    public static void main(String[] args)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int arr[] = {10,99,12,55,3,44,103,-2};
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
