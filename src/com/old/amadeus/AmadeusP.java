package com.old.amadeus;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AmadeusP {
    public static void main(String args[])
    {
        String input ="abccccaaaacdd";
        String s = Stream.of(input.split("")).
                collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet().
                stream().map(Map.Entry::getKey).findFirst().get();
        System.out.println(s);
        //  filter(e->e.getValue()>1).
            //   limit(1).
      //  .forEach(System.out::println);
        int arr[] = {2,7,11,15};
        int target =9;
        Map<Integer,Integer> hs = new HashMap<>();
        for(int i=0; i<arr.length;i++)
        {
            int index = target-arr[i];
            if(hs.containsKey(index))
            {
                System.out.println(hs.get(index)+","+i);
            }
            hs.put(arr[i],i);
        }
    }
}
