package com.nic.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayListMain {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(3);
		
       list.sort(null);//Natural sorting Order Acceding Order
       System.out.println("Acceding Order "+list);
       list.sort((a,b)-> b-a);// Descending Order Custom Sorting
       
       System.out.println("Descending Order "+list);
       
       System.out.println("------------------------------------");
       Integer[] a1 = {1,2,3,2,1};
		Integer[] a2 = {1,2,3};
		Integer[] a3 = {1,2,3,4};
		
		List<Integer> test = Stream.concat(Arrays.asList(a1).stream(),Arrays.asList(a2).stream()).toList();
		
		System.out.println("Add Two List: "+test);
		             List<Integer> addArray = Stream.concat(test.stream(), Arrays.asList(a3).stream()).toList();
		             System.out.println("Add Fial List: "+addArray);
		             
		                     List<Integer> distictList = addArray.stream().distinct().collect(Collectors.toList());
		                     System.out.println("Distict List : "+distictList);
//		 List<Integer> newList = Stream.concat(Arrays.asList(inputArray).stream().sorted().filter(l -> l>0).toList().stream(), 
//                 Arrays.asList(inputArray).stream().sorted().filter(l -> l<1).toList().stream())
//                .toList();
		                     
//		     	            ---------------------------------------- Find 2nd max element......................
		                     Integer[] input= {1,4,5,6,7,8};
		                     
		                     List<Integer> ccc = Arrays.asList(input).stream().sorted().toList();
		                     System.out.println("Accesding Order: "+ccc);
		                     System.out.println("Third Largest: "+ccc.get(ccc.size()-2)); 
		                     //
		                     
	}

}
