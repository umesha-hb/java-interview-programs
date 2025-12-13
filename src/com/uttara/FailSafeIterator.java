package com.uttara;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator 
{
	public static void main(String[] args) 
	{

		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		
		CopyOnWriteArrayList<Integer> cs = new CopyOnWriteArrayList<Integer>(al);
		Iterator<Integer> it = cs.iterator();
		while (it.hasNext())
		{
			Integer num = (Integer) it.next();
			System.out.println(num);
			cs.add(10);
			
		}
	}

}
