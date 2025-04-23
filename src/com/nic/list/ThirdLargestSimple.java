package com.nic.list;

import java.util.Arrays;

public class ThirdLargestSimple {
public static void main(String args[]) {
	
	int[] arr= {4,1,5,2,5,3,4,5,88};
	
	      int[] list = Arrays.stream(arr)
				             .distinct()
				             .sorted()
				             .toArray();
	      System.out.println("Distinct Element: "+Arrays.toString(list));  
	     System.out.println("Third Largest: "+list[list.length-3]);  
	             
}
}
