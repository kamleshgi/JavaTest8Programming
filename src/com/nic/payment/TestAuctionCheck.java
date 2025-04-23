package com.nic.payment;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestAuctionCheck {
//	 public static void main(String[] args) {
//	        // Simulate CommonDto
//	        CommonDto dto = new CommonDto();
//	        dto.setBankPayDate("2025-04-11 15:00:00.000");  // 3:00 PM (within auction window)
//	        dto.setStatus("PENDING"); // Not SUCCESS
//
//	        AuctionChecker checker = new AuctionChecker();
//	        checker.checkAuctionPeriodNew(dto);
//
//	        System.out.println("Bank Status: " + dto.getBankStatus());
//	        System.out.println("Bank Status Desc: " + dto.getBankStatusDesc());
//	    }
//	 
	 private LocalTime convertToLocalTime(String datetimeStr) {
		    // Expected format: "yyyy-MM-dd HH:mm:ss.SSS"
		    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
		    LocalDateTime dateTime = LocalDateTime.parse(datetimeStr, formatter);
		    return dateTime.toLocalTime();
		}
}
