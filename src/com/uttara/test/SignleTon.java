package com.uttara.test;

public class SignleTon
{
	private static SignleTon instance;
  private SignleTon()
  {
	  
  }
  public static SignleTon getInstance()
  {
	  if(instance==null)
	  {
		  return new SignleTon();
	  }
	  else
	  {
		  return instance;
	  }
  } 
}
