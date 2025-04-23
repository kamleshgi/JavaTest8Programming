package com.nic.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Question: Write a program to collect the elements of a list into a string separated by commas using a custom collector.
public class CreatingACustomCollector {
	public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Python", "C++", "JavaScript");

        String result = words.stream()
                             .collect(Collectors.joining(","));
        
        System.out.println("Joined String: " + result);
    }
}
