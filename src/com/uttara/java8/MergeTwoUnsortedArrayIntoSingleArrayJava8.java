package com.uttara.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArrayIntoSingleArrayJava8 {
	public static void main(String[] args) {
		int a[]= {1,3,5};
		int b[]= {2,4,6};
		int result[]= IntStream.concat(Arrays.stream(a), Arrays.stream(b)).
		sorted().toArray();
		System.out.println(Arrays.toString(result));
		Arrays.stream(result).forEach(System.out::println);
		
	}
}
