package com.old.virtusa;

import java.util.HashMap;
import java.util.Map;

//HashMap lookup optimization.
public class FindIndecisisInArrayForGivenSum {
    public static void main(String args[])
    {
        int arr[]={2,7,11,15};
        int sum=9;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++)
        {
            int complement = sum-arr[i];
            if(map.containsKey(complement))
            {
                System.out.println(map.get(complement)+","+i);
                break;
            }
            map.put(arr[i],i);
        }
    }
}
