package stream;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {
 public static void main(String[] args) {
	
	 List<Integer>list1= Arrays.asList(23,56,89,54,9,67,67,86);
	  list1.stream().filter(e -> e%2==0).forEach(System.out:: println);
}
}
