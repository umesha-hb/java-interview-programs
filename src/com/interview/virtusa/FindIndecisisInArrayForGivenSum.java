package com.interview.virtusa;

import java.util.HashMap;
import java.util.Map;

public class FindIndecisisInArrayForGivenSum {
    public static void main(String args[])
    {
        int arr[]={2,1,3,8,7};
        int sum=5;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++)
        {
            int index = sum-arr[i];
            if(map.containsKey(index))
            {
                System.out.println(i+":"+map.get(i));
              break;
            }
            map.put(arr[i],i);
        }
        System.out.println(map);
    }
}
