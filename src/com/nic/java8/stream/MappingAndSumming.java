package com.nic.java8.stream;

import java.util.Arrays;
import java.util.List;
//Question: Given a list of strings representing numbers, write a program to convert them to integers, square each number, and then calculate the sum of the squared numbers.
public class MappingAndSumming {
	public static void main(String[] args) {
        List<String> numberStrings = Arrays.asList("1", "2", "3", "4", "5");
        
        int sumOfSquares = numberStrings.stream()
                                        .map(Integer::parseInt)
                                        .map(n -> n * n)
                                        .reduce(0, Integer::sum);
        
        System.out.println("Sum of Squares: " + sumOfSquares);
    }
}
