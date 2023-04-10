package stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Parralstream {
 public static void main(String[] args) {
	     
	 Scanner sc = new Scanner (System.in);
	 
	    Set <Integer> set = new HashSet <>();
	    set.add(23);
	    set.add(67);
	    set.add(6);

	    set.add(37);

	    set.add(47);

	    set.add(87);
	    set.add(65);

	    
	    
	    
	    set.parallelStream().filter(x -> x<50)  .forEach(System.out:: println);
}
}
