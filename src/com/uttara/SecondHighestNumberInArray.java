package com.uttara;

public class SecondHighestNumberInArray {

    public static void main(String[] args) {


        int arr[] = {4, 5, 3, 1, 2};

        for (int i = 0; i < arr.length; i++) {///sort the array in ascending order using bubble sort
           for (int j = 0;j<arr.length-1;j++)
           {
               if (arr[j] > arr[j + 1]) {
                   int temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
             }

           }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
