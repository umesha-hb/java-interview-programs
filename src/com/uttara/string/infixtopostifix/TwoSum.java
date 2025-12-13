package com.uttara.string.infixtopostifix;

public class TwoSum
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
	        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
	       	        if(indices != null) {
	            System.out.println(indices[0] + " " + indices[1]);
	        }
	    }
}
