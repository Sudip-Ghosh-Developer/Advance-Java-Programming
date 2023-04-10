package com.embroyo.advjava.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocaldateTimeFormat {
 public static void main(String[] args) {
	 LocalDate localdate =LocalDate.now();
	 LocalDateTime ldt = LocalDateTime.now();
	 System.out.println(localdate);
	 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy -- m E a");
	  String date= ldt.format(dtf);
	  System.out.println(date);
	 
}
}
