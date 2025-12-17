package com.uttara;

import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArrayIntoSingleArray {
	public static void main(String[] args) {
		int a[]= {7,9,7,1,9,1};
		int b[]= {3,4,5,1,3,6,8};
		int result[]= IntStream.concat(Arrays.stream(a), Arrays.stream(b)).
		sorted().distinct().toArray();
		System.out.println(Arrays.toString(result));
		
	}
}
