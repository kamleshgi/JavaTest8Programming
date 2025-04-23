package com.nic.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConversionIntToString {

	public static void main(String[] args) {
		int[] arr = {2, 4, 3, 5, 7, 8, 1};
      
        
         Arrays.stream(arr).sorted()
        .mapToObj(n-> "("+n+")").forEach(System.out::println);
	}

}
