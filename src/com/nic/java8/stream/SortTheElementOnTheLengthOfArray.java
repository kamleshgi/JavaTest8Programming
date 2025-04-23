package com.nic.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheElementOnTheLengthOfArray {
public static void main(String[] args) {
	List<String> list = Arrays.asList("Kamlesh","Kamlesh","Ram","Karthik","kkkkkkkkkkkk");
	List<String> sort = list.stream()
			.distinct().sorted(Comparator.comparingInt(String::length))
	        .collect(Collectors.toList());
	
	System.out.println("SortedElement: "+sort);
	
	List<String> ascendingList = list.stream()
	.distinct().sorted((a,b)->
	  Integer.compare(b.length(), a.length()))
      .collect(Collectors.toList());
	
	System.out.println("ascendingList: "+ascendingList);
	
	
	String ascendingList1 = list.stream()
			.distinct().min((a,b)->
			  Integer.compare(a.length(), b.length())).get();
	System.out.println("ascendingList: "+ascendingList1);
}
}
