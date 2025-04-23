package com.nic.java8.sumofnumber;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class SumOfNumber {
public static void main(String args[]) {
	System.out.println("1. Sum OF NUMBER");
	   
	List<Integer> numList=Arrays.asList(1,2,3,4,6,22,3,90,89,2,1,3,4,55);
	Optional<Integer> sumnumber = numList.stream().reduce((a,b)->a+b);
   System.out.println("Sum Number: "+sumnumber.get());
   
   System.out.println("2. AVERAGE OF NUMBER");
   
   List<Integer> number=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
   Optional<Integer> sum = number.stream().reduce((a,b)->a+b);
   System.out.println(sum);
   
  double sumAvg = number.stream().mapToInt(e->e).average().getAsDouble();
  System.out.println("sumAvg : "+sumAvg);
  
  System.out.println("3. NUMBER Square averag");
  List<Integer> list1= Arrays.asList(1,10,20,30,15);//400+900+256
  double avg = list1.stream().map(e->e*e).filter(e->e>100).mapToInt(e->e).average().getAsDouble();
  
  System.out.println("Square Avg:"+avg);
  
  System.out.println("4. Find ODD EVEN NUMBER");
  List<Integer> numbers=Arrays.asList(11,2,3,45,67,9,90,87,8,2);
 List<Integer> eveNumber = numbers.stream().filter(n->n%2==0)
                          .collect(Collectors.toList());
 System.out.println("5.EVEN Numbers "+eveNumber);
 
 List<Integer> oddNumber = numbers.stream().filter(n->n%2!=0)
         .collect(Collectors.toList());
System.out.println("ODD Numbers "+oddNumber);

System.out.println("6.Numbers start with prifix 2");
 List<Integer> givenNumber=Arrays.asList(2,222,234,567,342,236,211,22,819);
 List<Integer> startWith2List = givenNumber.stream()
				             .map(e->String.valueOf(e))
		                     .filter(e->e.startsWith("2"))
		                     .map(Integer::valueOf)
		                     .collect(Collectors.toList());
 System.out.println(startWith2List);
 System.out.println("7.Print Duplicate Numbers Using Stream");
 
 List<Integer> dupList=Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3);
 Set<Integer> doubleList = dupList.stream()
		             .filter(e->Collections.frequency(dupList, e)>1)
		             .collect(Collectors.toSet());
 System.out.println(doubleList);
 
 System.out.println("8.Find Max and Min Numbers ");
 
 List<Integer> maxminList=Arrays.asList(1,2,3,44,55,66,99,100);
 Integer max = maxminList.stream().max(
		      Comparator.comparing(Integer::valueOf)).get();
 System.out.println(max);
 
 Integer min = maxminList.stream().min(
		       Comparator.comparing(Integer::valueOf)).get();
 System.out.println(min);

}
}
