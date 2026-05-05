package com.old.vantive;

public class ArrayTypeFinder {

    public static String findArrayType(int[] arr) {
       if (arr.length < 2) return "Invalid Array";

        boolean increasing = false;
        boolean decreasing = false;
        int changeCount = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[i - 1]) {
                if (decreasing) {
                    changeCount++;
                    decreasing = false;
                }
                increasing = true;

            } else if (arr[i] < arr[i - 1]) {
                if (increasing) {
                    changeCount++;
                    increasing = false;
                }
                decreasing = true;
            }
        }

        if (changeCount == 0 && increasing)
            return "Increasing Order";
        else if (changeCount == 0 && decreasing)
            return "Decreasing Order";
        else if (changeCount == 1 && !increasing)
            return "Increasing then Decreasing";
        else if (changeCount == 1 && !decreasing)
            return "Decreasing then Increasing";

        return "Not a valid type";
    }

    public static void main(String[] args) {
        int[] arr = {5,4,1,2,3};

        System.out.println(findArrayType(arr));
    }
}