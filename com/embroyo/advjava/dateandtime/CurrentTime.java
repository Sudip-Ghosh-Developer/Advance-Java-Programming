package com.embroyo.advjava.dateandtime;

public class CurrentTime {
  public static void main(String[] args) {
	
	    long currentTime = System.currentTimeMillis();
	      long days = currentTime/1000/3600/24;
	      long years = currentTime/1000/3600/24/365;
	      System.out.println("1970 years to present days total ="+days);
	      System.out.println("1970 years to present year total = "+years);
}
}
