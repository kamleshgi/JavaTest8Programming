package com.nic;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Calendar;

public class Test {
	public static void main(String arg[]) throws ParseException {
		
		BigDecimal sum1=new BigDecimal(00.00);
		BigDecimal grandTotal=new BigDecimal(00.00);
		
		
		
		
		
		//String To Big decimal
		//String amount="143.36000061035156";
		String amount=null;
//		 NumberFormat num = DecimalFormat.getNumberInstance();
//	        Number pointsNum = num.parse(amount);     
//	        double points = amount.DecimalFormat.format();
		BigDecimal bigDecimal = new BigDecimal(amount).setScale(2, BigDecimal.ROUND_HALF_UP);
		
		System.out.println("Amount in Double with 2 fraction "+bigDecimal);
		//Big decimal To String
		
		String amountSt=bigDecimal.toString();
		
		System.out.println("Big Decimal to Amount in Double with 2 fraction "+amountSt);
		
		
		long amountLong=(long) 143.36000061035156;
		
		System.out.println("amountLong :"+amountLong);
		
//		String input1
//        = "545456468445645468464645";
//    String input2
//        = "4256456484464684864864";

    // Convert the string input to BigDecimal
    BigDecimal one= new BigDecimal(1000.28);
    BigDecimal two= new BigDecimal(1600.98);
    BigDecimal sum=new BigDecimal(00.00).setScale(2, BigDecimal.ROUND_HALF_UP);  

    // Using add() method
     sum = one.add(two);
		
    System.out.println("sum  :"+sum.setScale(2, BigDecimal.ROUND_HALF_UP));	
		
		
		
		String sab=null;
		String str="null";
		if(sab== null || "".equals(sab)
				|| "null".equals(sab)) {
			System.out.println("Hi is Ok");
		}else {
			
			System.out.println("Hi is Not");
		}
		
		if(str== null || "".equals(str)
				|| "null".equals(str)) {
			System.out.println("Hi is Ok");
		}else {
			
			System.out.println("Hi is Not");
		}
		
		
		double d = 143.36000061035156;
		String bob = Double.toString(d);
		String[] convert = bob.split("\\.");

		int a = Integer.parseInt(convert[0]);
		int b = Integer.parseInt(convert[1].substring(0,2));
		if (b > 0) {
			System.out.println(d);
		} else {
			System.out.println(a);

		}
		System.out.println(a); // 13454
		System.out.println(b); // 92345
		String s = "100.00";
		String f = "100.00";
		long l = 100;
		double h = Double.valueOf(s) + Double.valueOf(f);// 200.00/00.00
		l = (long) (l + h);

		getChallanYear();

		String subxml = "<?xml version=\"1.0\" encoding=\"utf-8\"?><string xmlns=\"http://tempuri.org/\">Y|Payment has not been made for the given Echallan number|</string>";

		// subxml = subxml.substring(subxml.indexOf("<string
		// xmlns=\\\"http://tempuri.org/\\\">"), subxml.indexOf("</string>"));
		System.out.println("subxml: " + subxml);

		String op_dt = "";
		// boolean tt=isNullOrBlank(op_dt);
		if (isNullOrBlank(op_dt)) {
			System.out.println("Working");
		}
	}

//************ Get Challan Year ********************************************
	public static int getChallanYear() {
		int currentYear = 0;
		try {
			LocalDate currentdate = LocalDate.now();
			int currentMonth = currentdate.getMonth().getValue();
			if (currentMonth <= Calendar.APRIL) {
				currentYear = currentdate.getYear() - 1;
			} else {
				currentYear = currentdate.getYear();
			}
		} catch (Exception e) {

		}
		return currentYear;
	}// end getChallanYear....

	public static boolean isNullOrBlank(String strCheck) {
		if ((strCheck == null) || (strCheck.trim().length() <= 0)) {
			return true;
		} else {
			return false;
		}
	}

}
