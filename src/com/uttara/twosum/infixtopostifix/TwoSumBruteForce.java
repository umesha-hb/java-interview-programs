package com.uttara.twosum.infixtopostifix;

//Brute Force – O(n²)
public class TwoSumBruteForce
{
	 public static int[] findTwoSum(int[] list, int sum)
	    {
	        try
	        {
	        	
	            for(int i=0;i<list.length-1;i++)
	            {
	                for(int j=0;j<list.length-1;j++)
	                {
	                    if(list[i]+list[j] == sum)
	                    {
	                    	 return new int[] {i,j };
	                    	   	
	                    }
	                }
	            }
	        } 
	        catch(Exception e ){
	            throw new UnsupportedOperationException("Waiting to be implemented.");  
	        }
	        return new int[] {};
	    }

	    public static void main(String[] args) {
	        int[] indices = findTwoSum(new int[] {2, 7, 11, 15 }, 9);
	       	        if(indices != null) {
	            System.out.println(indices[0] + " " + indices[1]);
	        }
	    }
}
