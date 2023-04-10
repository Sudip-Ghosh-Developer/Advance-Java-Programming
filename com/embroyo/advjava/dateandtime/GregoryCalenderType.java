package com.embroyo.advjava.dateandtime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;


public class GregoryCalenderType {
      
	public static void main(String[] args) {
		 Calendar c = Calendar.getInstance();
		
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println(cal.isLeapYear(2004)); /// cheak leapyear 
		for(int i=0 ;i<500;i++)
		 System.out.println(TimeZone.getAvailableIDs()[i]);
	}
	
}
