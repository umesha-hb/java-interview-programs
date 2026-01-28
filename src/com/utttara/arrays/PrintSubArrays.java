package com.utttara.arrays;

import java.util.ArrayList;
import java.util.OptionalInt;

public class PrintSubArrays {
    public static void main(String[] args) {
        int arr[] =  {-2,1,-3,4,-1,2,1,-5,4};;

        for (int start = 0; start < arr.length; start++) {//visit every element
            for (int end = start; end < arr.length; end++) {//get starting and ending indexs of subarray
                System.out.print("Subarray ("+start+","+end+"):{");
                for (int k = start; k <= end; k++) {

                    System.out.print(" " + arr[k]);
                }

                System.out.println(" }");
            }

        }

    }
}
