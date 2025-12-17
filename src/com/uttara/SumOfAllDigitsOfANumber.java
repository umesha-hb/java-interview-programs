package com.uttara;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigitsOfANumber {

	public static void main(String[] args) {
		int number=567;
		int sum = Stream.of(String.valueOf(number).split("")).
		collect(Collectors.summingInt(n ->Integer.parseInt(n)));
		System.out.println(sum);

	}

}
