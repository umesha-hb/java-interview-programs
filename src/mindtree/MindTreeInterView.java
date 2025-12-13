package mindtree;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * list -> ["Ram", "Ashok", "Jayaram", "Suresh"]
Write a Java8 program to count number of characters in each name & collect the result in HashMap
o/p: {Ram=3, Ashok=5, Jayaram=7, Suresh=6}
 */

public class MindTreeInterView {

	public static void main(String[] args) {

		List<String> al = Arrays.asList("Ram","Ram", "Ashok", "Jayaram", "Suresh");
		Map<String, Integer> map = al.stream().distinct().collect(Collectors.toMap(Function.identity(), e -> e.length()));
	System.out.println(map);

		Stream<String> s = Stream.of("apple", "banana", "orange");
		Map<String, Object> m = s.collect(Collectors.toMap(Function.identity(), s1 -> s1.length()));
//	        System.out.println(m);

	 
	}

}
