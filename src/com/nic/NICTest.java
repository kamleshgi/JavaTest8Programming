package com.nic;

import java.util.HashMap;
import java.util.Map;

public class NICTest {

	public static void main(String[] args) {
		String s="DTO|01|005|DTO001|2024-2025|O|01/04/2024|31/03/2099|0041|HEAD_OF_ACCOUNT1=0041-00-101-02-01-01|AMOUNT1=300|HEAD_OF_ACCOUNT2=0041-00-101-02-02-01|AMOUNT2=100|HEAD_OF_ACCOUNT3=0041-00-101-02-03-01|AMOUNT3=0|HEAD_OF_ACCOUNT4=0041-00-101-02-04-01|AMOUNT4=0|HEAD_OF_ACCOUNT5=0041-00-101-02-05-01|AMOUNT5=0|HEAD_OF_ACCOUNT6=0041-00-101-02-06-01|AMOUNT6=0|HEAD_OF_ACCOUNT7=0041-00-101-02-07-01|AMOUNT7=0|HEAD_OF_ACCOUNT8=0041-00-101-02-08-01|AMOUNT8=0|HEAD_OF_ACCOUNT9=0041-00-101-02-09-01|AMOUNT9=0|HEAD_OF_ACCOUNT10=0041-00-101-02-10-01|AMOUNT10=0|HEAD_OF_ACCOUNT11=0041-00-101-02-11-01|AMOUNT11=0|HEAD_OF_ACCOUNT12=0041-00-101-02-14-01|AMOUNT12=0|HEAD_OF_ACCOUNT13=0041-00-101-02-15-01|AMOUNT13=0|HEAD_OF_ACCOUNT14=0041-00-101-02-16-01|AMOUNT14=0|HEAD_OF_ACCOUNT15=0041-00-102-01-01-01|AMOUNT15=0|HEAD_OF_ACCOUNT16=0041-00-102-01-02-01|AMOUNT16=0|HEAD_OF_ACCOUNT17=0041-00-102-01-03-01|AMOUNT17=0|HEAD_OF_ACCOUNT18=0041-00-102-01-04-01|AMOUNT18=0|HEAD_OF_ACCOUNT19=0041-00-102-02-03-01|AMOUNT19=0|HEAD_OF_ACCOUNT20=0041-00-102-02-04-01|AMOUNT20=0|HEAD_OF_ACCOUNT21=0041-00-101-02-17-01|AMOUNT21=500|500.00|ARN2408220035075||TEST ARUNAV|||||7005206822|ARN2408220035075||VAHAN|||";
		Map<String, String> map = new HashMap<>();
		String [] data=s.split("\\|");
		StringBuilder dd = new StringBuilder();
		int count=0;
		StringBuilder headSb=new StringBuilder();
		for (String stringl : data) {
			String[] entry =data[count].split("=");
			if(entry.length>1) {
				map.put(entry[0].trim(), entry[1].trim());
				headSb.append(data[count]+"|");
			}else{
				dd.append(data[count]+"|");
			}
			count++;
		}
	   int i=0;
		StringBuilder dd1 = new StringBuilder();
		while (i <= map.size()) {
			if (map.containsKey("AMOUNT" + i) && Double.parseDouble(map.get("AMOUNT" + i)) > 0) {
				dd1.append(map.get("HEAD_OF_ACCOUNT" + i).toString() + "|" + map.get("AMOUNT" + i).toString() + "|");
			}
			i++;
		}	
		String[] stri = dd1.toString().split("\\|");
		int count2=stri.length;
	    StringBuffer sb = new StringBuffer();
		for (int j=0; j<17; j++) {
			if(count2>j) {
				sb.append(stri[j]).append("|");		
			}else {
				sb.append("|");	
			}
		}
		System.out.println("Original String: "+s);
		String finaltem=s.replace(headSb.toString().substring(0, headSb.toString().length() - 1),"TEMP_HEAD|");
		String finaltem1=finaltem.replace("TEMP_HEAD|", sb.toString().substring(0, sb.toString().length() - 1));
		String finaltem2=finaltem1.toString().substring(0, finaltem1.toString().length() - 1);
		System.out.println("Final String11: "+finaltem2);
	//	System.out.println("Original String1111: "+sb);

		
	}
	
 static String[] separateRuleNos(String ruleStr, char sep) {
		String[] rule = null;
		int i = 1;
		int index = 0;
		// calls findNoRules method which count number of separators in string and
		// stores in noOfComma of int type
		int noOfComma = findNoRules(ruleStr, String.valueOf(sep));
		if (noOfComma > 0) {
			rule = new String[noOfComma];
		}
		while (i > 0) {
			i = ruleStr.indexOf(sep);

			if (i > 0) {
				rule[index] = ruleStr.substring(0, i);
			} else {
				rule[index] = ruleStr;
			}
			ruleStr = ruleStr.substring(i + 1, ruleStr.length());
			index++;
		}
		return rule;
	}// end...
	
	private static int findNoRules(String ruleStr, String sep) {
		int noOfRule = 0;
		int noOfComma = 0;
		String str = "";
		for (int p = 0; p < ruleStr.length(); p++) {
			str = ruleStr.charAt(p) + "";
			if (str.equalsIgnoreCase(sep)) {
				noOfComma++;
			}
		}
		noOfRule = noOfComma + 1;
		return noOfRule;
	}// end...

}
