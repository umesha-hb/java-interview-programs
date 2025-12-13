package com.uttara;

import java.util.Arrays;

public class ArrayRotation
{
    public static void main(String[] args)
    {
        int arr []={1,2,3,4,5,6,7,8};
        int numOfRotation=4;
        int temp[]=new int[arr.length];
        int counter=0;
        for (int i=numOfRotation;i<arr.length;i++)
        {
               temp[counter++] = arr[i];
        }
        for(int i=0; i<numOfRotation; i++)
        {
            temp[counter++] = arr[i];
        }
//        System.out.println(Arrays.toString(temp));
        for (int i=0;i<temp.length;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
}
