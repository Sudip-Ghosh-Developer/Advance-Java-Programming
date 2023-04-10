package stream;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveDuplicapteString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println(" enetr here :");
		String str = sc.nextLine();
		
		// using split to whitespace
		
		String sr = Arrays.stream(str.split("\\s+")).distinct().collect(Collectors.joining(" "));
		 System.out.println(sr);
	}

}
