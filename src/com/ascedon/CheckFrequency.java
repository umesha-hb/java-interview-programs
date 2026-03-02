package com.ascedon;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckFrequency {
    public static void main(String args[])
    {
//        check if frequency of ALL characters is same.
//        Return "YES" if true, "NO" otherwise.
//            Input: s = "aabbcd"
//        Output: "NO"  (a:2,b:2,c:1,d:1)
//        Input: s = "abc"
//        Output: "YES" (a:1,b:1,c:1)

        String input ="abcb";
     System.out.println(checkFrequencyOfAllCharacters(input));
//        System.out.println(checkFrequencyOfAllCharactersinJava7(input));




    }

    private static String checkFrequencyOfAllCharactersinJava7(String input) {
        int count = 0;
        boolean flag=false;
Map<Character,Integer> map = new HashMap();
        for(char ch :input.toCharArray() )
        {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
                   }
        if(map.entrySet().stream().filter(e->e.getValue()>=1).collect(Collectors.toList()).size()>1)
        {
            return "NO";
        }
        else
        {
            return "YES";
        }
    }

    private static String checkFrequencyOfAllCharacters(String s) {
        Map<String,Long> map = Stream.of(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
        List l =map.entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toList());
        System.out.println(l.size());
        if(l.size()>=1)
        {
            return "NO";
        }
        else
        {
            return "YES";
        }
    }
}
