package wipro;

import java.util.Scanner;  
public class Main
{ 
public  static int countEvens(int[] nums){
int result;
int count=0;
  int i=0;
  while(i<nums.length)
  {
    if(nums[i++]%2==0)
    {
      count++;
    }
  }
  result = count;
return result;
}
public static void main(String[] args)   
{
int n;  
System.out.println("Enter Array Length");
Scanner sc=new Scanner(System.in);  
n=sc.nextInt();  
int[] array = new int[n];  
for(int i=0; i<n; i++)  
{     
array[i]=sc.nextInt();  
}
int output=countEvens(array);
System.out.println(output);
 }
} 
