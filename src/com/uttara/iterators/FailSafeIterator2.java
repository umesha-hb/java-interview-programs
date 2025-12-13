package com.uttara.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator2 {

	public static void main(String[] args)
	{
		  //creating ArrayList  
        ArrayList<String> students = new ArrayList<String>();   
        students.add("Emma");   
        students.add("Paul");   
        students.add("Walker");  
          
        //creating CopyOnWriteArrayList by copy students ArrayList   
        CopyOnWriteArrayList<String> copyStudents = new CopyOnWriteArrayList<String>(students);   
          
        //creating an instance of the Iterator class  
        Iterator itr = copyStudents.iterator();   
          
        //iterating CopyOnWriteArrayList using Iterator   
        while (itr.hasNext()) {  
            String name = (String)itr.next();   
            System.out.println(name);   
            if (name.equals("Paul"))   
                // The Rubby name will not print but it has created separate copy   
                copyStudents.add("Rubby");  
        }
	}

}
