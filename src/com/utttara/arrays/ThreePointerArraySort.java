package com.utttara.arrays;


public class ThreePointerArraySort {
    public static void main(String[] args) {


            int[] arr = {2,0,2,1,1,0};

            sort(arr);

            for(int num : arr){
                System.out.print(num + " ");
            }
        }


    /*
ThreePointerArraySort
✅ Algorithm Steps
while (mid <= high)

If arr[mid] == 0
swap(arr[low], arr[mid])
low++
mid++

Else if arr[mid] == 1
mid++

Else
 arr[mid] == 2
swap(arr[mid], arr[high])
high--
*/
    public static void sort(int[] arr) {

        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;

            } else if (arr[mid] == 1) {
                mid++;

            } else {
                swap(arr, mid, high);
                high--;
            }
        }
     }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
