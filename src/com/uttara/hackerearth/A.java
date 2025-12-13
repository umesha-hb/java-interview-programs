package com.uttara.hackerearth;

import java.util.HashMap;

public class A {
int val=10;
	public static void main(String[] args) {
		A a= new A();
//		System.out.println(a.val);
		HashMap<Integer, Object> hashMap = new HashMap<Integer, Object>();
		hashMap.put(1, "One");
		hashMap.put(2, 2);
		hashMap.put(3, "Three");
		hashMap.put(6, 6);
		Integer[] result = new Integer[hashMap.size()];
	hashMap.keySet().toArray(result);
		for(int i :result)
		{
			System.out.print(hashMap.get(i%2));
		}
		

	}

}
