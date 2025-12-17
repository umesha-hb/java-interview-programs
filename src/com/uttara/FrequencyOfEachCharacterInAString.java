package com.uttara;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacterInAString {
	public static void main(String args[]) {
		String inputString = "mphasis";
	Map m =	inputString.chars().mapToObj(c->(char)c).
			collect(Collectors.groupingBy(Function.identity(),
					LinkedHashMap::new,
					Collectors.counting()));
		System.out.println(m);

	}

}
