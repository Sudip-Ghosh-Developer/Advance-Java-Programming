package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
   public static void main (String[]args) {
	   
	   List<Integer> list1 = Arrays.asList(34,67,78,44,678);
	   
	   System.out.println(list1);
	   Stream<Integer>num=list1.stream();
	  List<Integer>list2= num.filter(d->d>50).collect(Collectors.toList());
	 	   System.out.println(list2);
   }
	
}
