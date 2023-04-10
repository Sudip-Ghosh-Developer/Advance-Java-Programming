package com.embroyo.advjava.dateandtime;

import java.util.Calendar;
import java.util.TimeZone;

public class CalenderType {
	public static void main(String[] args) {
		 Calendar cal = Calendar.getInstance();
		 System.out.println(cal.getCalendarType());
		 System.out.println(cal.getTimeZone().getID());
		 System.out.println(cal.getTime());
		 System.out.println(cal.getTimeInMillis());
		 
		 	/*
		 	 * find date ,time ,day for use this method 
		 	 */
		 System.out.println(cal.get(Calendar.DATE));
		 System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		 
	}

}
