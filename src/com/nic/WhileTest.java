package com.nic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WhileTest {

	
	public static void main(String[] args) {
		DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate startDate = LocalDate.parse("2022-01-01", dateformatter);
		// LocalDate startDate = LocalDate.parse("2022-01-01");
		while (!startDate.equals(LocalDate.now())) {
			System.out.println("StartDate: "+startDate);
			
			startDate = startDate.plusDays(1);
	}
 }
}
