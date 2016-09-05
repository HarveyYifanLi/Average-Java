package com.apress.syntaxExample;

public class AverageImpl {
  private long begin;
  private long end;
  private int[] ints;
  private static final String EXCEPTION_MESSAGE = "ints must contain at least one int" ;
  
  // first is the constructor
  public AverageImpl(int[] ints) throws IllegalArgumentException{
	if (ints.length == 0){
	  throw new IllegalArgumentException(EXCEPTION_MESSAGE);
	}
	
	this.ints=ints;
  }
  
  public static float averageTwoNumbers(int a, int b){
	return (float) (a+b)/2;
  }
  
  public int[] getInts(){
	return ints;
  }
  
  public void setInts(int[] ints) throws IllegalArgumentException{
	if (ints.length == 0){
		throw new IllegalArgumentException(EXCEPTION_MESSAGE);
	}
	this.ints = ints;
  }
  public long getRunTime(){
	return end - begin;
	  
  }

}
