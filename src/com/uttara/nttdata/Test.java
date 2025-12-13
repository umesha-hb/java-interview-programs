package com.uttara.nttdata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,5};
		int b[]= {15,25,20,10};
		int c[]= {30,35,40,5};
		//expect output single integer array elements in sorted descending order there should not be any duplicate
		Set<Integer> hs = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			hs.add(b[i]);
		}
		for (int i = 0; i < c.length; i++) {
			hs.add(c[i]);
		}
		List l =hs.stream().sorted().collect(Collectors.toList());
		
		int d[]=new int[hs.size()];
		for (int i = 0; i < hs.size(); i++) {
			d[i]=(int) l.get(i);
		}
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]+" ");
		}
		Arrays.asList(d).stream().sorted().forEach(System.out::println);
		Map<String, Integer> map = new HashMap<>();
		map.put("python", 3);
		map.put(".net", 2);
		map.put("java", 1);
		map.entrySet().stream().sorted((e1,e2)->e1.getValue()>e2.getValue()?1:-1).forEach(System.out::println);
		
	}

}
