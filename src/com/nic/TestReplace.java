package com.nic;

public class TestReplace {

	public static void main(String[] args) {
		String str="YEAR=FINANCIAL_YEAR|DEPT_CODE=073|SERVICE_CODE=301|DEPT_REF_ID=TRANS_ID|TOTAL_AMOUNT=GRAND_TOTAL|";
		str=str.substring(0, str.length() - 1);
       str=str.replaceAll("FINANCIAL_YEAR", "2021");
       
       String Stringg="VAHAN";
       if (!"CHECKPOST".equalsIgnoreCase(Stringg)
              && !"TRAFFIC".equalsIgnoreCase(Stringg)) {
           System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
       }
	}
	
	String json="{\"status\":true,\"errorCode\":null,\"errorMessage\":null,\"data\":{\"sek\":\"J8BjeWCgTSH\\/TzbE\\/q5faVI6X10uJWvRY0S6qe1Q9v42fYvIUdfWNrO8bsXlAYbf\",\"authToken\":\"acb3fb1f-0429-4c5c-94b2-198ff698d103\"}}";
	
	
	
	

}
