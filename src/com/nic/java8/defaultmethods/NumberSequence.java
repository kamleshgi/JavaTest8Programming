package com.nic.java8.defaultmethods;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberSequence {
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 999)
        .mapToObj(i -> String.format("%03d", i))
        .forEach(k->k.toString());
		
		
	List<String> list= IntStream.rangeClosed(001, 999)
        .mapToObj(i -> String.format("%03d", i))
        .collect(Collectors.toList());
	
	for (String string : list) {
	System.out.println("string: "+string);
	}
    }
}
