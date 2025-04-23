package com.nic;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AccountSplit {
	public static void main(String[] args) {
        String s = "DTO|01|005|DTO001|2024-2025|O|01/04/2024|31/03/2099|0041|HEAD_OF_ACCOUNT1=0041-00-101-02-01-01|AMOUNT1=300|HEAD_OF_ACCOUNT2=0041-00-101-02-02-01|AMOUNT2=100|HEAD_OF_ACCOUNT3=0041-00-101-02-03-01|AMOUNT3=0|HEAD_OF_ACCOUNT4=0041-00-101-02-04-01|AMOUNT4=0|HEAD_OF_ACCOUNT5=0041-00-101-02-05-01|AMOUNT5=0|HEAD_OF_ACCOUNT6=0041-00-101-02-06-01|AMOUNT6=0|HEAD_OF_ACCOUNT7=0041-00-101-02-07-01|AMOUNT7=0|HEAD_OF_ACCOUNT8=0041-00-101-02-08-01|AMOUNT8=0|HEAD_OF_ACCOUNT9=0041-00-101-02-09-01|AMOUNT9=0|HEAD_OF_ACCOUNT10=0041-00-101-02-10-01|AMOUNT10=0|HEAD_OF_ACCOUNT11=0041-00-101-02-11-01|AMOUNT11=0|HEAD_OF_ACCOUNT12=0041-00-101-02-14-01|AMOUNT12=0|HEAD_OF_ACCOUNT13=0041-00-101-02-15-01|AMOUNT13=0|HEAD_OF_ACCOUNT14=0041-00-101-02-16-01|AMOUNT14=0|HEAD_OF_ACCOUNT15=0041-00-102-01-01-01|AMOUNT15=0|HEAD_OF_ACCOUNT16=0041-00-102-01-02-01|AMOUNT16=0|HEAD_OF_ACCOUNT17=0041-00-102-01-03-01|AMOUNT17=0|HEAD_OF_ACCOUNT18=0041-00-102-01-04-01|AMOUNT18=0|HEAD_OF_ACCOUNT19=0041-00-102-02-03-01|AMOUNT19=0|HEAD_OF_ACCOUNT20=0041-00-102-02-04-01|AMOUNT20=0|HEAD_OF_ACCOUNT21=0041-00-101-02-17-01|AMOUNT21=500|500.00|ARN2408220035075||TEST ARUNAV|||||7005206822|ARN2408220035075||VAHAN|||";
        
        // Split the string by "|"
        String[] data = s.split("\\|");

        // Collect key-value pairs into a map and build the head string
        Map<String, String> map = Arrays.stream(data)
                .filter(entry -> entry.contains("="))
                .map(entry -> entry.split("="))
                .collect(Collectors.toMap(
                        entry -> entry[0].trim(),
                        entry -> entry.length > 1 ? entry[1].trim() : "")
                );

        // Collect the non key-value pairs into a separate string
        String headSb = Arrays.stream(data)
                .filter(entry -> entry.contains("="))
                .collect(Collectors.joining("|")) + "|";
        
//        String dd = Arrays.stream(data)
//                .filter(entry -> !entry.contains("="))
//                .collect(Collectors.joining("|")) + "|";

        // Build the filtered string based on amounts greater than 0
        String dd1 = IntStream.rangeClosed(1, map.size())
                .filter(i -> map.containsKey("AMOUNT" + i) && Double.parseDouble(map.get("AMOUNT" + i)) > 0)
                .mapToObj(i -> map.get("HEAD_OF_ACCOUNT" + i) + "|" + map.get("AMOUNT" + i))
                .collect(Collectors.joining("|")) + "|";

        // Limit to 17 elements, pad with empty strings if necessary
        String sb = IntStream.range(0, 17)
                .mapToObj(i -> i < dd1.split("\\|").length ? dd1.split("\\|")[i] : "")
                .collect(Collectors.joining("|"));

        System.out.println("Original String: " + s);
        
        // Replace the original head part with the new generated string
        String finaltem = Optional.ofNullable(s.replaceFirst(headSb.substring(0, headSb.length() - 1), "TEMP_HEAD|"))
                                  .orElse(s);
        String finaltem1 = finaltem.replaceFirst("TEMP_HEAD\\|", sb.substring(0, sb.length() - 1));
        String finaltem2 = finaltem1.substring(0, finaltem1.length() - 1);
        
        System.out.println("Final String: " + finaltem2);
    }
}
