package com.nic.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringPrograms {
 public static void main(String args[]) {
//	 1.Find the First Non-Repeating Character in a String
	 String str = "swissiiiiiiiiiwwwwwwwk";

	 String[] stryArray = str.split("");
	                   Map<String, Long> map = Arrays.asList(stryArray).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	                              System.out.println(map);
	                              
	 Optional<String> list = map.entrySet().stream().filter(l->l.getValue()==1).map(e->(e.getKey()+" "+e.getValue())).collect(Collectors.toList()).stream().findFirst();
	                         System.out.println(list);
	                         
	                         
//	  2. Reverse a String Using Java 8    
	                         
	   String str2 = "hello";
	    String strBuilder=new StringBuilder(str2).reverse().toString();
	   System.out.println("Reverse String: "+strBuilder);
	   
//	3. Count the Occurrences of Each Character in a String
	   
	   String str3 = "programming";
	   String[] stryArray3 = str3.split("");
	                   Map<String, Long> map3 = Arrays.asList(stryArray3).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	                   System.out.println("Occurrences: "+map3);
	                   
//  4.Remove Duplicate Characters from a String
	                   String str4 = "banana";
	                   
	                   String[] stryArray4  =str4.split("");
	                    Set<String> list4 = Arrays.asList(stryArray4).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	                    .entrySet().stream().filter( c -> c.getValue() > 1).map(Map.Entry::getKey ).collect(Collectors.toSet());
	                   System.out.println(list4);
//	6.            
	                    List<String> str4List = Arrays.asList(stryArray4);
	                   Collections.reverse(str4List);                 
	                   System.out.println(str4List.stream().collect(Collectors.joining()));
	                   
 }
}
