package com.nic.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//Question: Given a list of integers, find the maximum value using streams.
public class FindingtheMaximum2 {
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 9, 1, 6);
        
        Optional<Integer> maxNumber = numbers.stream()
                                             .max(Integer::compareTo);
        
        maxNumber.ifPresent(max -> System.out.println("Maximum Number: " + max));
    }
}
