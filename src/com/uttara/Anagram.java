package com.uttara;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//same characters with the same frequencies.
public class Anagram {
	public static void main(String[] args) {

		String s1 = "geeks";
		String s2 = "kseeg";
		String s3 = Arrays.stream(s1.split("")).sorted()
				.collect(Collectors.joining(""));
		String s4 = Arrays.stream(s2.split("")).sorted()
				.collect(Collectors.joining(""));
		System.out.println(s3.equals(s4));

		if (s3.equals(s4))
			System.out.println("Two Strings are Anagrams");
		else
			System.out.println("Two Strings are Not Anagrams");
	}
}

