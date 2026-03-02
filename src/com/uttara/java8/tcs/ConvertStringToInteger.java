package com.uttara.java8.tcs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertStringToInteger {

	public static void main(String[] args) {

		convert("234");
	}
	public static void convert(String s) 
	{
		Stream.of(s.split("")).map(e -> Integer.valueOf(e)).
				forEach(e->System.out.print(e));
	} 
}
