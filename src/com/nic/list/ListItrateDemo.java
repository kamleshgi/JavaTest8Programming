package com.nic.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListItrateDemo {
	public static void main(String args[]) {
		int count=0;
		ArrayList<String> list=new ArrayList<>();
		list.add("Kamlesh");
		list.add("Saurabh");
		list.add("tarun");
		list.add("Kamal");
		//String s= list.stream().findFirst().map(s->s.contains("K"));
		
		list.stream().filter(s->s.startsWith("K")).collect(Collectors.toList()).forEach(s->System.out.println(s+"==="+ count));
		
		System.out.println("=================================================");
		for (String string : list) {
			System.out.println(string);
			if(string.startsWith("K")) {
				//count++;
			}
		}
		System.out.println(count);
		
		System.out.println("=======To perform print operation on each element of reversely sorted stream.==========================================");
		
		ArrayList<String> list1=new ArrayList<>();
		list1.add("2");
		list1.add("3");
		list1.add("6");
		list1.add("4");
		list1.add("5");
		list1.add("7");
		list1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("=======To perform print operation on each element of string stream.=======================");
		
		List<String> listOprat=new ArrayList<>();
		listOprat.add("GFG");
		listOprat.add("Geeks");
		listOprat.add("for");
		listOprat.add("GeeksforGeeks");
		
		listOprat.stream().forEach(System.out::println);
		System.out.println("=======");
		listOprat.stream().sorted(Comparator.naturalOrder()).flatMap(str-> Stream.of(str.charAt(0)))
		       .forEach(System.out::println);
		System.out.println("=======");	
		String sname="Kamlesh";
		 for (char charStr : sname.toCharArray()) {
			 if (charStr=='K') {
				 System.out.println(charStr);
			}			
		}     
		 System.out.println("====print the elements of integer array in original order.===");
		 
		 List<Integer> numberLis=new ArrayList<>();
		 numberLis.add(10);
		 numberLis.add(12);
		 numberLis.add(9);
		 
		 numberLis.stream().forEachOrdered(System.out::println);
		 System.out.println("====String Type Array==="); 
		 List<String> nameList=new ArrayList<>();
		 nameList.add("Kamlesh");
		 
		 //nameList.stream().filter(s->s.toCharArray()=='K').collect(Collectors.toList()).forEach(System.out::println);
		 nameList.stream().map(str->Stream.of(str.charAt(0)=='K')).forEach(System.out::println);   
	}

	
	

}
