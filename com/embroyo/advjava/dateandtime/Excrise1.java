package com.embroyo.advjava.dateandtime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Excrise1 {
 public static void main(String[] args) {
	      /*
	       *  Display time in different language
	       */
	Calendar cal = Calendar.getInstance();
	    System.out.println("our country time language ="+ cal.getTime());
	    LocalDate ld = LocalDate.now();
	    Locale language = new Locale("el"); // you can take different language code
	   DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,language);
	   String str = df.format(cal.getTime());
	   System.out.println("different language time ="+ str);
}
}
