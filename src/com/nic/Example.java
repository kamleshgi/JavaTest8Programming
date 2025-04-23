package com.nic;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
	private BigDecimal bankAmount;
    public static void main(String[] args) {
    	Example dobj=new Example();
    	String amount = "NA";
    	if (!"NA".equals(amount)) {  // Correct way to compare strings
    		dobj.setBankAmount(new BigDecimal(amount).setScale(2, RoundingMode.HALF_UP));
    	}

    String totalAmt = String.valueOf(dobj.getBankAmount());

    	if (totalAmt.isEmpty() || "0".equals(totalAmt) || "null".equals(totalAmt)) {
    	    // Perform necessary actions
    	    System.out.println("Invalid or empty total amount");
    	}
    	
    	
    	
    	
    	
        final String regex = "MPTHOM[0-9]+";
        final String string = "Invalid URN MPTHOM210520223885869 received from Department. Double verification for the same is not possible. Please try with a valid URN.";
        
        findurnNumber(string);
        
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);     
        if (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }

	private static void findurnNumber(String string) {
		 final Pattern pattern = Pattern.compile( "MPTHOM[0-9]+", Pattern.MULTILINE);
	        final Matcher matcher = pattern.matcher(string);     
	        if (matcher.find()) {
	            System.out.println("Full match: " + matcher.group(0));
	        }
		
	}

	public BigDecimal getBankAmount() {
		return bankAmount;
	}

	public void setBankAmount(BigDecimal bankAmount) {
		this.bankAmount = bankAmount;
	}   
    
}
