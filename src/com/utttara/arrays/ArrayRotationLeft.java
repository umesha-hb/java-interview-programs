package com.utttara.arrays;

import java.util.Arrays;

public class ArrayRotationLeft {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n=arr.length;
        int k=3;
        for (int i = 0; i <k ; i++) {
            int first=arr[0];
            for (int j = 0; j < n-1; j++)
            {
                arr[j]=arr[j+1];
            }
            arr[n-1]=first;
        }
        System.out.println(Arrays.toString(arr));
    }
}
/*
Direction intuition
Right rotation → clockwise
Left rotation → anticlockwise
        Example

Array:

        [1, 2, 3, 4, 5]

Right rotate by 1 (clockwise):

        [5, 1, 2, 3, 4]

Left rotate by 1 (anticlockwise):

        [2, 3, 4, 5, 1]
*/
