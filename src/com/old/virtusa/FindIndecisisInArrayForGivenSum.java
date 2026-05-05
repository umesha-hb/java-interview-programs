package com.old.virtusa;

import java.util.HashMap;
import java.util.Map;

public class FindIndecisisInArrayForGivenSum {
    public static void main(String args[])
    {
        int arr[]={2,7,11,15};
        int sum=9;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++)
        {
            int index = sum-arr[i];
            if(map.containsKey(index))
            {
                System.out.println(i+":"+map.get(index));
                break;
            }
            map.put(arr[i],i);
        }
    }
}
