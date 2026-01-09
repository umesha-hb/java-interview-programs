package com.utttara.arrays;

import java.util.ArrayList;
import java.util.OptionalInt;

public class PrintSubArrays {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 2, 4, 3};

        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {

                for (int k = start; k <= end; k++) {

                    System.out.print(" " + arr[k]);
                }

                System.out.println();
            }

        }

    }
}
