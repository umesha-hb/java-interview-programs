package com.uttara.remove.duplicateInArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsInArrayUsingMap {

	public static void removeDuplicateUsingSorting(int arr[]) {
	   Map<Integer,Integer> map = new HashMap<Integer, Integer>();
	   for (int i = 0; i < arr.length; i++)
	   {
		   if (!map.containsKey(arr[i]) )
			   map.put(arr[i], 1);
	   } 
//	    map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e -> System.out.println(e.getKey()));
		/*
		 * Map<Integer,Integer> result = map.entrySet() .stream()
		 * .sorted(Map.Entry.comparingByKey()) .collect(Collectors.toMap(
		 * Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
		 * LinkedHashMap::new)); result.entrySet().stream().forEach(e ->
		 * System.out.println(e.getKey()));
		 */
	    
	    
	   Set keys =  map.keySet();
	   keys.stream().forEach(System.out::println);
	    
		// Sort an unsorted array
		/*
		 * Arrays.sort(arr); int len = arr.length; int j = 0; // Traverse an array for
		 * (int i = 0; i < len - 1; i++) { // if value present at i and i+1 index is not
		 * equal if (arr[i] != arr[i + 1]) { arr[j++] = arr[i]; } } arr[j++] = arr[len -
		 * 1]; for (int k = 0; k < j; k++) { System.out.print(arr[k] + " "); }
		 */
	}

	public static void main(String[] args) {
		int arr[] = { 5, 1, 2, 6, 4, 4, 5, 6, 8, 17 };
		removeDuplicateUsingSorting(arr);
	}
}