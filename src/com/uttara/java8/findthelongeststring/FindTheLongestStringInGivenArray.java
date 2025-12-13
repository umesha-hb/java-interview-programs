package com.uttara.java8.findthelongeststring;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindTheLongestStringInGivenArray {

	public static void main(String[] args) {
		String[] strArry = {"java","techie","springboot","microservices"};
		Map<String, Integer> map = Arrays.stream(strArry).collect(Collectors.toMap(e->e,e->e.length()));
		System.out.println(map);
	

	}

}
