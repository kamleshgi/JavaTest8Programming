package com.nic.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IstofStringsToUppercase {
public static void main(String[] args) {
	List<String> list=Arrays.asList("Kamlesh","KUMAR","TARUN","Shourabh");
	System.out.println("List of strings: " + list);
    // Convert strings to uppercase using streams
	
	List < String > uppercaseStrings=list.stream().map(String :: toUpperCase).collect(Collectors.toList());
	 System.out.println("\nUppercase Strings: " + uppercaseStrings);
	 
	// Convert strings to uppercase using streams
	 
	List<String> lowercaseString= list.stream().map(String::toLowerCase).collect(Collectors.toList());
	
	System.out.println("\n Lower Case String: "+lowercaseString);
	 
	 
	 
}
}
