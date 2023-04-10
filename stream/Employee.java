package stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.embroyo.student.StudentList;

public class Employee {
 public static void main(String[] args) {
	
	 List<String>list1 = Arrays.asList("sudip","sumon","taniya","munna");
	List <String> list3 = list1.stream().filter(x -> x.contains("m")).collect(Collectors.toList());
	System.out.println(list3);
	
	 StudentList sudip=new StudentList("sudip",23,"cse","midinipur");
	 StudentList suman=new StudentList("suman",22,"cse","bisnupur");
	 StudentList munna=new StudentList("munna",24,"ece","dumkal");
	 StudentList taniya=new StudentList("taniya",20,"bca","murshidabad");
	 StudentList sujata=new StudentList("sujata",21,"ce","pruliya");
	 List <StudentList> list2 = new ArrayList<>();
	 list2.add(sudip);
	 list2.add(suman);
	 list2.add(munna);
	 list2.add(taniya);
	 
	 Map<String,List<Object>> map = new HashMap<>();
	 list2.stream().forEach(emp -> 
	 {map.computeIfAbsent( emp.getName(), x-> new ArrayList<Object>()).add(emp.getCity());});
	 System.out.println(map);
}
}
