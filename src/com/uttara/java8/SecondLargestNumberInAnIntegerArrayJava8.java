package com.uttara.java8;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestNumberInAnIntegerArrayJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] listofIntegers={3,4,5,1,3,6,8};
		int secondLargestNumber=Arrays.stream(listofIntegers).boxed()
		.sorted(Comparator.reverseOrder())
		.skip(1).findFirst().get();
		System.out.println("secondLargestNumber="+secondLargestNumber);

	}

}
