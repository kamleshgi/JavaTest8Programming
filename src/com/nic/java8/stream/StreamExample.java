package com.nic.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//Question: Given a list of words, group them by their length.
public class StreamExample {
	public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");
        
        Map<Integer, List<String>> wordsByLength = words.stream()
                                                        .collect(Collectors.groupingBy(String::length));
        
        wordsByLength.forEach((length, wordList) -> 
            System.out.println("Length " + length + ": " + wordList));
    }
}
