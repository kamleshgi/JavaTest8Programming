package com.nic.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class PaymentGateway {

	
   public static void main(String args[]) {
	     
	List<Company> arrayList=  Arrays.asList(new Company("MYIT", new Address("PANCHSHEEL",new City("NOIDA EXT", new State("UP"))), Arrays.asList(new Person(1, "Kamlesh"),new Person(2, "Kamlesh2"))));
               
	/*
	 * List<String> list= arrayList.stream() .map(Company::getAddress)
	 * .map(Address::getCity) .map(City::getName);
	 * 
	 * arrayList.stream().collect(Collector<T, A, R>)
	 */
	/*
	 * for (String string : list) { System.out.println(string); }
	 * 
	 * 
	 * System.out.println(list);
	 */
   }
}
