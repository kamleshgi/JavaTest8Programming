package com.nic.java8.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondLowestHighestNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 3, 10, 40, 19, 3, 40);
		// 40,30,20..0
		 List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		 
		System.out.println("Natural Sorting Order(Accesnding Order): "+sortedList);
		
		List<Integer> cotomiseSortingList = list.stream()
		 .sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
		System.out.println("Customize Sorting Order(descending Order): "+cotomiseSortingList);
		
		System.out.println("Second highest Number Using CompareTo Method");	
		int secondLagestNumber = list.stream()
				.sorted((a,b)->b.compareTo(a))
				.distinct()
				.skip(1)
				.findFirst().get();
		System.out.println(secondLagestNumber);
		
		System.out.println("Second lowest Number Using CompareTo Method");	
					  int numb =list.stream().sorted()
					  .distinct()
					  .skip(1)
					  .findFirst().get();
					  System.out.println(numb);
		
		System.out.println("Second highest Number");
		Integer secH = list.stream()
				     .sorted(Collections.reverseOrder())
				     .distinct().limit(2).skip(1).findFirst().get();
		System.out.println(secH);

		Integer secHh = list.stream().sorted(Collections.reverseOrder())
				        .distinct().skip(1).findFirst().get();
		System.out.println(secHh);

		System.out.println("Second Lowest Number");
		// 0,1,2,3
		Integer secL = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(secL);
	}
}
