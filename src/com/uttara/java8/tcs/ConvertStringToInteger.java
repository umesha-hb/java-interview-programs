package com.uttara.java8.tcs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertStringToInteger {

	public static void main(String[] args) {

		convert("234");
	}
	public static void convert(String s) 
	{
		int sum = Arrays.stream(s.split(""))
				.map(e -> Integer.valueOf(e))
				.mapToInt(n -> n).sum();
		System.out.println(sum);
		Stream.of(s.split("")).map(e -> Integer.valueOf(e)).
				forEach(e->System.out.print(e));
		String s1 = "liril";
		String s2 = new StringBuilder(s1).reverse().toString();

	} 
}
