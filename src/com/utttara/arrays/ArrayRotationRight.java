package com.utttara.arrays;

import java.util.Arrays;
/*

 Trace (k = 3)

Initial:

        [1, 2, 3, 4, 5, 6, 7]
After 1 rotation:
        [7, 1, 2, 3, 4, 5, 6]
After 2 rotations:
        [6, 7, 1, 2, 3, 4, 5]
After 3 rotations:
        [5, 6, 7, 1, 2, 3, 4]

 */
public class ArrayRotationRight {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int k=3;
        for (int i = 0; i < k; i++)
        {
            int last=arr[n-1];
            for (int j = n-1; j >0 ; j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=last;
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

