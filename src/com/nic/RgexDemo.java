package com.nic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RgexDemo {
	
	public static void main(String[] args) {
		
		String textString="0042-00-104-0000-000-55$M5";
       final String regex = "\\$M\\d";
        
        // Replace all occurrences with an empty string
        String result = textString.replaceAll(regex, "");
        
        System.out.println("After removal: " + result);
		
   
		
		StringBuffer stribuff=new StringBuffer();
	        //String text = "50.00|INR|TCO||0.0|INR|MCT||0.0|INR|POST";
	        String text="335.69|INR|TCO||64.31|INR|MCT||58.00|INR|POST||0.0|INR|MCT||0.0|INR|MCT";
	        String[] parts = text.split("\\|\\|");
	        for (String part : parts) {	         	
	            if (!part.contains("0.0|")) {
	                stribuff.append("||"+part);
	            }
	        }	        
	        System.out.println("Append String "+stribuff.replace(0, 2, ""));
	    }
	
	

}
