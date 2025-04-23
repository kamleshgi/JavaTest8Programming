package com.nic.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AddTwoArrayList {
//	Given two integer arrays, write a java 8 program to result an array having elements as sum of elements of arr1 and arr2
//	int[] arr1={4,3,2,5} ; int[] arr2 = {1,3,3,4} ; int[] result ={5,6,5,9}
	public static void main(String[] args) {
		int[] arr1 = { 4, 3, 2, 5 };
		int[] arr2 = { 1, 3, 3, 4 };

		int[] list = IntStream.range(0, arr1.length).map(i -> arr1[i] + arr2[i]).toArray();

		System.out.println(Arrays.toString(list));


//1		  Find Pairs in an Array with Given Sum

		Integer[] arr = { 2, 2, 4, 3, 5, 7, 8, 1, 1 };// O/P: [(4, 5), (2, 7), (8, 1), (8, 1)]

		Integer sum = 9;

		List<Integer> listofArray = Arrays.asList(arr);
		Set<Integer> seen = new HashSet<>();

		List<String> pairs = listofArray.stream().filter(n -> {
			boolean found = seen.contains(sum - n);
			seen.add(n);
			return found;
		}).map(n -> "(" + (sum - n) + ", " + n + ")").collect(Collectors.toList());
		System.out.println(pairs);

//2.      Find the Second Largest Number in an Array
		Integer[] arrT = { 10, 20, 4, 45, 99, 99, 50 };// o/p::50
		List<Integer> arrTList = Arrays.asList(arrT);
		List<Integer> descList = arrTList.stream().distinct().sorted().toList();
		System.out.println("DescList" + descList);
		System.out.println("Second Largest Number: " + descList.get(descList.size() - 2));

//3.	  	Find the First Non-Repeating Element in an Array
		Integer[] arrNonRep = { 4, 5, 1, 2, 0, 4, 5, 2 }; // O/P:: 0
		List<Integer> arrNonRepToList = Arrays.asList(arrNonRep);
		Map<Integer, Long> nonReptedelement = arrNonRepToList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(nonReptedelement);
		Optional<Integer> firstNonRep = nonReptedelement.entrySet().stream().filter(e -> e.getValue() == 1)
				.map(Map.Entry::getKey).findFirst();
		System.out.println("irst Non-Repeating Element: " + firstNonRep);

//4.      Move All Zeros to the End of Array
		Integer[] arr4 = { 1, 0, 2, 0, 3, 4, 5, 0 };// o/p: [1, 2, 3, 4, 5, 0, 0, 0]

		List<Integer> list4 = Arrays.asList(arr4);

		List<Integer> sortedList4 = list4.stream().sorted().collect(Collectors.toList());
		System.out.println("sortedList4 " + sortedList4);

		List<Integer> moveZeroToEnd = Stream
				.concat(sortedList4.stream().filter(n -> n >= 1), sortedList4.stream().filter(n -> n < 1))
				.collect(Collectors.toList());
		System.out.println("moveZeroToEnd : " + moveZeroToEnd);

//5. Find Duplicate Elements in an Array

		Integer[] arr5 = { 1, 2, 3, 4, 2, 3, 5, 6, 5 };

		List<Integer> list5 = Arrays.asList(arr5);
		Map<Integer, Long> elementCountList = list5.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Duplicate Element: " + elementCountList);

		List<Integer> duplicateList = elementCountList.entrySet().stream().filter(e -> e.getValue() > 1)
				.map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("5. DuplicateList: " + duplicateList);
		
//6.    Find the Intersection of Two Arrays
		 int[] arr6 = {4, 3, 2, 5, 7};
	     int[] arr7 = {1, 3, 3, 4, 8};
		
	 
//	 	=========================================================================================== 	     
	         
	    Set<Integer> set6=new HashSet<>();
	    for (Integer int6 : arr6) {
	    	set6.add(int6);
		}
	    
	    System.out.println("Set6 : " + set6);
	    
	    Set<Integer> intersectionSet=new HashSet<>();
	    for (Integer int7: arr7) {
			if(set6.contains(int7)) {
				intersectionSet.add(int7);
			}
		}
	    System.out.println("intersectionSet : " + intersectionSet);
	    
//	===========================================================================================    
	    
	    Set<Integer> set = Arrays.stream(arr6).boxed().collect(Collectors.toSet());

        List<Integer> intersection = Arrays.stream(arr7)
                                           .boxed()
                                           .filter(set::contains)
                                           .distinct()
                                           .collect(Collectors.toList());
       System.out.println("Intersection: " + intersection); // Output: [3, 4]
       
       
       
	}// main method end.

}
