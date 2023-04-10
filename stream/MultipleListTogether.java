package stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MultipleListTogether {
	
	public static void main(String[] args) {
		 
		List<String> list1 = Arrays.asList("sudip","taniya");
		List<String> list2 = Arrays.asList("munna","suman","raja");

		List<String> list3 = Arrays.asList("rakesh","sujata","kinu","kochi");
   System.out.println(
		Stream.of(list1,list2,list3).flatMap(List :: stream). collect(Collectors.toList())
		);
   
   Map<String,List<String>> map1= new LinkedHashMap<>();
   map1.put("one", list3);
   map1.put("two", list2);
   
    
		System.out.println(map1);
		System.out.println(
		map1.values().stream().flatMap(List :: stream).collect(Collectors.toSet())
	  );
	
	}

}
