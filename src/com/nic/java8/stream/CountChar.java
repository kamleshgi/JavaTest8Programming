package com.nic.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountChar {
	public static void main(String[] args) {
		//1.
		String str = "ilovejavatecjie";
		// a=2,c=1,t=1,e=3,v=2,h=1,i=2,j=1,i=1,o=1

		String[] strArr = str.split("");
		List<String> list = Arrays.asList(strArr);

		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		
//		2.-----------------------------------------------------------------------------
		String givenString="KamleshKumar";//o/p: k-2,a=2,m=2,l=1,e=1,s=1,h=1,u,r=2
		String[] sss = givenString.split("");
		     List<String>   myList =Arrays.asList(sss);
		     Map<String, Long> countChar = myList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println("countChar "+countChar);
		
		//find Distinct Character count
		
		List<Entry<String, Long>> distictChar = countChar.entrySet().stream().filter(e->e.getValue()==2).collect(Collectors.toList());
		System.out.println("distictChar "+distictChar);
			
//		3.-----------------------------------------------------------------------------	
		             Map<String, Long> pp = Arrays.asList(sss).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		             System.out.println("Cont the Charecter: "+pp);
//		 4.-----------------------------------------------------------------------------		             
		 //find the Distinct Character
		      // Convert to String to Array
		      String[]  normaArray= givenString.split("");
		  //Convert Array to List
		      List<String> listTest = Arrays.asList(normaArray);
		  // count the Duplicate Element from List
		     List<String> distictList = listTest.stream().distinct().collect(Collectors.toList());
		            System.out.println("distict Charecter "+distictList);
		  
		            // Duplicate Character
		            
		            //1. Given String to convert Array
		            //2. Array to convert List
		            //3. List to convert Stream
		            //4. stream to  grouping By Character
		            //5. convert to again Stream and Convert to Set 
		            //6. Filter the Set Stream where set is greater then 1 
		            String[] rowStringArray=givenString.split("");
		            List<String> rowStringList = Arrays.asList(rowStringArray);
		            List<String> dublicateCharList=rowStringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
										            .entrySet().stream()
										            .filter(a -> a.getValue() >1).map(Map.Entry::getKey).collect(Collectors.toList());
		           
		            System.out.println("dublicateCharList :"+dublicateCharList);
		            
//		   		 5.-----------------------------------------------------------------------------			            
		            //find only 2 times Repudiated Character 
		            
		            //1.String to Array
		            //2.Array to ArrayList
		            //3.ArrayList to Stream
		            //4.Stream to Grouping By Element Count
		            //5.Stream to set by setInterface
		            //6.filter to 
		            
		            String[] arrlistString = givenString.split("");
		                                   List<String> twoTimesList = Arrays.asList(arrlistString).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		                                     .entrySet().stream().filter(x ->x.getValue()>2).map(Map.Entry::getKey).collect(Collectors.toList());
		                                   System.out.println("twoTimesList: "+twoTimesList);
//		6.-----------------------------------------------------------------------------      		
		/** Find all duplicate element from a given string **/
		            System.out.println("Find all duplicate element from a given string");
		List<String> dublicateElement = list.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(dublicateElement);

		List<String> out = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
		.filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		
//		 7.-----------------------------------------------------------------------------		
		/** Non Repeated Element for given String **/
		System.out.println("Non Repeated Element for given String");
		List<String> nonRepetList = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.filter(x -> x.getValue() == 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println("nonRepetList: "+nonRepetList);
		
//		-----------------unquieElements------------------------------------------
		String input="vivekkadiyan";
		System.out.println("input String: "+input);
		  List<String> unqui = Arrays.asList(input.split("")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		  .entrySet().stream().filter(e -> e.getValue()==1).map(Map.Entry::getKey).collect(Collectors.toList());
		
		  System.out.println("Unquie Element: "+unqui);
		
		
	}
}
