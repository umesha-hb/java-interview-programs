package com.utttara.arrays;

public class TwoSmallestNumbersInArray {
    public static void main(String args[])
    {
        int arr[] = {10,99,12,55,3,44,103,-2};
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int i=0;i< arr.length;i++)
        {
            if(arr[i]<min1)
            {
                min2 = min1;
                min1 = arr[i];
                System.out.println(+min2+" and "+min1);
            }
        }
        System.out.println("Without array sorting Two Smallest Numbers In Array "+min1+" and "+min2);
    }
}
