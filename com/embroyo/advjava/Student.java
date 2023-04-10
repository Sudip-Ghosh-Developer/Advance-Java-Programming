package com.embroyo.advjava;

public interface Student {
	String  name(String a);
	public default int age(int a) {
		 
		return a;
	}
	

}
