package com.gainwell;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateElementsInaList {
  //  Find the duplicate elements using streams 1,2,4,5,4,3,2 Ans : 2,4
    public static void main(String args[])
    {
        HashSet<Integer> hs = new HashSet();
        Arrays.asList(1,2,4,5,4,3,2).stream()
                .filter(e->!hs.add(e)).forEach(System.out::println);
        }
}
