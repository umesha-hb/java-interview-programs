package com.utttara.arrays;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {

	public static void main(String[] args) {
		int[] arrayOne = {1,2,3,4,5};
		int[] arrayTwo = {5,3,6,7,9,8};
		 Set<Integer> obj = new HashSet<>();
		 int i,j;
	       for(i=0; i<arrayOne.length; i++){
	            obj.add(arrayOne[i]);
	        }
	        for(j=0; j<arrayTwo.length; j++){
	            obj.add(arrayTwo[j]);
	        }
	        System.out.println("The union of both the arrays is");
	        for(Integer I: obj){
	            System.out.print(I + " ");
	        }
	        System.out.println();
	        System.out.println("=================================");
	        obj.clear();
	        System.out.println("The intersection of both the arrays is");
	        for(i=0; i<arrayOne.length; i++){
	            obj.add(arrayOne[i]);
	        }
	        for(j=0; j<arrayTwo.length; j++){
	            if(obj.contains(arrayTwo[j]))
	                System.out.print(arrayTwo[j] + " ");
	        }
	        obj.clear();
	        System.out.println();
	        System.out.println("The Unique elements both the arrays is");
	        boolean contains = false;
	        for(i=0; i<arrayOne.length; i++){
	        	 for(j=0; j<arrayTwo.length; j++)
	        	 {
	        		if(arrayOne[i]==arrayTwo[j])
	        		{
	        			contains = true;
	                    break;
	        		}
	        	 }
	        	 if(!contains){
	                 obj.add(arrayOne[i]);
	                 obj.add(arrayTwo[i]);
	             }
	             else{
	                 contains = false;
	             }
	        }
	        System.out.println(obj);
	}

}
