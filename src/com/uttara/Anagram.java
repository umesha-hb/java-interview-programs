package com.uttara;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//same characters with the same frequencies.
public class Anagram {

	public static void main(String[] args) {

		String s1 = "geeks";
		String s2 = "kseeg";
		s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted()
				.collect(Collectors.joining());
		s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted()
				.collect(Collectors.joining());
		if (s1.equals(s2))
			System.out.println("Two Strings are Anagrams");
		else
			System.out.println("Two Strings are Not Anagrams");
	}
}
@FunctionalInterface
interface B extends A{
	public void a();
}
@FunctionalInterface
interface A
{
	public void a();

}

