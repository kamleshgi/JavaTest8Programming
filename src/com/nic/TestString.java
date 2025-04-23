package com.nic;

public class TestString {

	public static void main(String args[]) {
		
		String NEFT="NEFT";
		String RTGS="RTGS";
		String NEFT_RTGS="NEFT";
		//String NEFT_RTGS="neft/rtgs";
		if(NEFT_RTGS.equalsIgnoreCase("NEFT/RTGS")) {
		System.out.println("OK NEFT_RTGS");	
		}
      if(NEFT.equalsIgnoreCase("NEFT")) {
    	  System.out.println("OK NEFT");	
		}
		
		
		String str="merchant_code=VAHANTRANSPORTMVSIKKIMNIC2021|merchant_ref_no=SKY2304200435102|amount=7500|return_url=https://vahan.parivahan.gov.in/vahanpgi/faces/ui/sbsbankResponse.xhtml";
		String arr[]=str.split("\\|");
		System.out.println(arr[0]);
		
		//String newString=arr[0].substring(arr[0].indexOf("merchant_code=")+"merchant_code=".length());
		//fFH.indexOf(ApplicationConfig.OWNER_NAME), fFH.indexOf(ApplicationConfig.OWNER_NAME) + ApplicationConfig.OWNER_NAME.length(), pgiPayDtlsObj.getOwnerName();
		
		String merchant_code=str.substring(str.indexOf("merchant_code=")+"merchant_code=".length());
		
		System.out.println(merchant_code);
	}
}
