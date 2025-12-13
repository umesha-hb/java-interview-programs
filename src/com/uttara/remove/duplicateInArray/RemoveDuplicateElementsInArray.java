package com.uttara.remove.duplicateInArray;

import java.util.Arrays;
import java.util.stream.Stream;

public class RemoveDuplicateElementsInArray{
public static int removeDuplicateElement(int arr[], int n)

    {
	 if (n == 0 || n == 1) {
         return n;
     }

     // creating another array for only storing
     // the unique elements
     int[] temp = new int[n];
     int j = 0;
     for (int i = 0; i < n - 1; i++) {
         if (arr[i] != arr[i + 1]) {
             temp[j++] = arr[i];
         }
     }

     temp[j++] = arr[n - 1];

     // Changing the original array
     for (int i = 0; i < j; i++) {
    	 arr[i] = temp[i];
     } 

     return j;
    }
     
    public static void main (String[] args) 
    {
        int arr[] = {1, 2,  2, 3, 3, 4, 4, 4, 5, 5, 6 };
        Arrays.sort(arr);
        int length = arr.length;
         
        length = removeDuplicateElement(arr, length);
        //printing array elements
        for (int i=0; i<length; i++)
           System.out.print(arr[i]+" ");
    }
}

