package com.nic.java8;

import java.util.Arrays;
import java.util.List;

public class AvrgList {
//	1. Write a Java program to calculate the average of a list of integers using streams.
	public static void main(String[] args) {
		  List< Integer> nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
		    System.out.println("List of numbers: " + nums);
		     Double average=  nums.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
		    System.out.println("Average value of the said numbers: " + average);
		    
	}
}
