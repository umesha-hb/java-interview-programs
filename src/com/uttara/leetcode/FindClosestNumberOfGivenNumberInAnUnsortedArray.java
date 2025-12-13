package com.uttara.leetcode;

public class FindClosestNumberOfGivenNumberInAnUnsortedArray
{
	public static void main(String[] args)
	{
		int a[] = {2,4,9,1};
		System.out.println(a[getClosetNumberOfTarget(a, 2)]);
	}

	private static int getClosetNumberOfTarget(int[] dataArray, int target)
	{
		if (dataArray.length == 0)
		{
			System.out.println("Empty Array. Terminating program.");
			System.exit(1);
		}
		int indexOfClosestNumberToTarget = 0;
		int absoluteDistanceOfNumberToTarget = Math.abs(dataArray[indexOfClosestNumberToTarget] - target);
		if (absoluteDistanceOfNumberToTarget == 0)
			return indexOfClosestNumberToTarget;
		for (int i = 1; i < dataArray.length; i++) 
		{
			int deltaOfCurrentElement = Math.abs(dataArray[i] - target);
			if (deltaOfCurrentElement == 0)
				return i;
			else if (deltaOfCurrentElement < absoluteDistanceOfNumberToTarget)
			{
				indexOfClosestNumberToTarget = i;
				absoluteDistanceOfNumberToTarget = deltaOfCurrentElement;
			}
		}
		return indexOfClosestNumberToTarget;
	}
	
	 public static  int closestValue(int[] dataArray,int target)
	  {
		 int indexOfClosestNumberToTarget = 0;
		int absoluteDistanceOfNumberToTarget = Math.abs(dataArray[indexOfClosestNumberToTarget] - target);
		if(absoluteDistanceOfNumberToTarget == 0)
		{
			return indexOfClosestNumberToTarget;
		}
		 for(int i = 1 ;i<dataArray.length;i++)
		 {
				int deltaOfCurrentElement = Math.abs(dataArray[i] - target);
		   if(deltaOfCurrentElement == 0)
		   {
			 return i;
		   }
		  else  if(deltaOfCurrentElement < absoluteDistanceOfNumberToTarget)
		   {
			  indexOfClosestNumberToTarget  = i;
			  absoluteDistanceOfNumberToTarget = deltaOfCurrentElement;
		   }
		 }
		return indexOfClosestNumberToTarget;
	  }
}
