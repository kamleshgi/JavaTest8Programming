package com.nic.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharactersOccurrenceFrequency {

	public static void main(String[] args) {
		String input="AABBBCCD";
//		o/p:A2B3C2D1 ;
//		 Step:
//			  1. String to Split in charect and store in array.
//			  2. Array to convert List
//			  3. List to convert Stream()
//			  4. Stream to grouping by and identity and Count the Character the frequency 
//		      5. use eNtry set to add map and join the List 
		
		String[] inputArry = input.split("");
		List<String> inputList = Arrays.asList(inputArry);
       String alist = inputList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).toString();
       System.out.println("alist: "+alist.replace("=", "").replace(", ", ""));
       
       
      String output = inputList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
    		                    .entrySet().stream().map(e -> e.getKey()+""+e.getValue()).collect(Collectors.joining());
	   System.out.println(output);
	   
	   
	   String[] myList = input.split("");
	                     String myoputPut = Arrays.asList(myList).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	                      .entrySet().stream().map(e->e.getKey()+""+e.getValue()).collect(Collectors.joining());
	                     
	                     System.out.println(myoputPut);
//		            		-----------------------------------------------------------------------------                     
//    Given String str= “swiss”; write java 8 code to find the first non-repeating character without using HashMap.
	                     String str="swiss";
	                     String[] arr = str.split("");
	                     List<String> lsi = Arrays.asList(arr);

	                     Optional<String> sss = lsi.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	                    		 .entrySet().stream().filter(l->l.getValue()<2).map(Map.Entry::getKey).collect(Collectors.toList()).stream().findFirst();
	                     System.out.println(sss);
//		            		-----------------------------------------------------------------------------  	                     
	                     String strn = "ilovejavatecjie";
	             		// a=2,c=1,t=1,e=3,v=2,h=1,i=2,j=1,i=1,o=1

	             		String[] strArr = strn.split("");
	             		List<String> list = Arrays.asList(strArr);

	             		Map<String, Long> map = list.stream()
	             				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	             		System.out.println(map);	                     
	                     
//	            		-----------------------------------------------------------------------------      		
	            		/** Find all duplicate element from a given string **/
	            		            System.out.println("Find all duplicate element from a given string");
	            		List<String> dublicateElement = list.stream()
	            				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	            				.entrySet().stream()
	            				.filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
	            		System.out.println(dublicateElement);

	            		List<String> out = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
	            		.filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
	            		
	            		
	            		/** Non Repeated Element for given String **/
	            		System.out.println("Non Repeated Element for given String");
	            		List<String> nonRepetList = list.stream()
	            				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
	            				.entrySet().stream()
	            				.filter(x -> x.getValue() == 1)
	            				.map(Map.Entry::getKey)
	            				.collect(Collectors.toList());
	            		System.out.println(nonRepetList);   
	            		
//	            		----------------------------------------------------------------------------- 	            		
	            		List<String> listname = Arrays.asList("Kamlesh","Kamlesh","Ram","Karthik","kkkkkkkkkkkk");
	            		List<String> sort = listname.stream()
				            				.distinct().sorted(Comparator.comparingInt(String::length))
				            		        .collect(Collectors.toList());
	            		
	            		System.out.println("SortedElement: "+sort);
	            		
	            		List<String> ascendingList = listname.stream()
					            		.distinct().sorted((a,b)->
					            		  Integer.compare(b.length(), a.length()))
					            	      .collect(Collectors.toList());
	            		
	            		System.out.println("ascendingList: "+ascendingList);
	            		
	            		
	            		String ascendingList1 = listname.stream()
	            				.distinct().min((a,b)->
	            				  Integer.compare(a.length(), b.length())).get();
	            		System.out.println("ascendingList: "+ascendingList1);
//	                  --------------------
	            		List<String> listC=Arrays.asList("Kamlesh","KUMAR","TARUN","Shourabh");
	            		System.out.println("List of strings: " + listC);
	            	    // Convert strings to uppercase using streams
	            		
	            		List < String > uppercaseStrings=listC.stream().map(String :: toUpperCase).collect(Collectors.toList());
	            		 System.out.println("\nUppercase Strings: " + uppercaseStrings);
	            		 
	            		// Convert strings to uppercase using streams
	            		 
	            		List<String> lowercaseString= listC.stream().map(String::toLowerCase).collect(Collectors.toList());
	            		
	            		System.out.println("\n Lower Case String: "+lowercaseString);
	            		
	            		List<String> ascendingName = listC.stream().sorted((a,b)->a.compareTo(b)).toList();
	            		System.out.println("ascendingName : "+ascendingName);
	            		
	            		List<String> descendingName = listC.stream().sorted((a,b)->b.compareTo(a)).toList();
	            		System.out.println("descendingName : "+descendingName);
//	            		------------------------------------
	            		//Sort strings on the basis of city.
	            		String[] cities = {"New York", "London", "Paris"};
	            		
	            		            List<String> listcities = Arrays.asList(cities).stream().sorted().collect(Collectors.toList());
	            		            System.out.println("listcities : "+listcities);
	            		            List<String> listcitiesNew =Arrays.asList(cities).stream().sorted((a,b)->b.compareTo(a)).toList();
	            		            System.out.println("listcitiesNew : "+listcitiesNew);
	            		            
	            		            
//	            ---------------------------------------- Find 2nd max element......................
	            		            
	            		            
	            		
	}

}
