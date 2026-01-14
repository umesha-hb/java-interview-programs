package com.utttara.arrays;

public class PrintSubArraysSumBrute {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                System.out.print("Subarray ("+start+","+end+"):{");
                int sum=0;
                for (int k = start; k <= end; k++) {
                    sum = sum +arr[k];
                    System.out.print(" " + arr[k]);
                }
                System.out.print(" } : sum "+sum+"\n");
            }
        }
    }
}
