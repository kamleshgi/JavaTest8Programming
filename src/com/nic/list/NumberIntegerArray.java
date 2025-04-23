package com.nic.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NumberIntegerArray {

	public static void main(String[] args) {
	
		Integer [] inputArray= {1,0,2,0,3,4,5,0};
//		              List<Integer> inputList = Arrays.asList(inputArray);
//		              List<Integer> sortedList = inputList.stream().sorted().toList();
//		              System.out.println(sortedList);
//		              List<Integer> newList=sortedList.stream().filter(l -> l>0).toList();
//		              System.out.println(newList);
//		              List<Integer> newList1= sortedList.stream().filter(l -> l <1).toList();
//		              System.out.println(newList1);
//		              
//		            List<Integer> finalList = Stream.concat(newList.stream(), newList1.stream()).toList();
//                    System.out.println("finalList: "+finalList);
		
		
//		Step: 
//			   1. Array to convert List.
		      Arrays.asList(inputArray);
//		      2. List to convert Stream.
		      Arrays.asList(inputArray).stream();
//		      3. Stream to sort the List
		      Arrays.asList(inputArray).stream().sorted();
//		      4. Sorted list to Break two Part 
//	            i : list > 0
		      Arrays.asList(inputArray).stream().sorted().filter(l -> l>0);
//		        2: list < 1
		      Arrays.asList(inputArray).stream().sorted().filter(l -> l<1);
		      
//		      5. add Two list using Steam.concatinate
		      
		      List<Integer> newList = Stream.concat(Arrays.asList(inputArray).stream().sorted().filter(l -> l>0).toList().stream(), 
		    		                                Arrays.asList(inputArray).stream().sorted().filter(l -> l<1).toList().stream())
		    		                               .toList();
		      System.out.println(newList);
	}

}
