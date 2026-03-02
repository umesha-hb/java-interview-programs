package com.utttara.strings;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindTheLongestStringInGivenArray {

	public static void main(String[] args) {
		String[] strArry = {"java","techie","springboot","microservices"};
		System.out.println("LongestString: " + findLongestString(strArry));

		String LongestString= Arrays.stream(strArry)
				.max((a, b) -> Integer.compare(a.length(), b.length()))
				.orElse(null);
		System.out.println("LongestString: " + LongestString);

	}
/*
Trace Table :
| i | arr[i]        | Length | Current Longest | Updated? |
| - | ------------- | ------ | --------------- | -------- |
| — | Java          | 4      | Java            | Initial  |
| 1 | SpringBoot    | 10     | SpringBoot      | Yes      |
| 2 | AWS           | 3      | SpringBoot      | No       |
| 3 | Microservices | 13     | Microservices   | Yes      |

 */
	public static String findLongestString(String[] arr) {
		if (arr == null || arr.length == 0) {
			return null;
		}

		String longest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i].length() > longest.length()) {
				longest = arr[i];
			}
		}

		return longest;
	}

}
