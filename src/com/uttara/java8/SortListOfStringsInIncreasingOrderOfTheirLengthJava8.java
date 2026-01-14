package com.uttara.java8;


import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;


public class SortListOfStringsInIncreasingOrderOfTheirLengthJava8 {

	public static void main(String[] args) {
	     List<String> list = Arrays.asList( "ba", "ban", "banana", "apple", "ap", "ab", "cherry");

	        List<String> sortedList = list.stream()
	                                      .sorted()
												  .collect(Collectors.toList());
	        System.out.println(sortedList);
	}

}
