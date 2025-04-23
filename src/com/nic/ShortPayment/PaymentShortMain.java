package com.nic.ShortPayment;

import java.util.Arrays;

public class PaymentShortMain {
 public static void main(String args[]) {
	 
	 Payment[] payObjArray=new Payment[4];
	 payObjArray[0]=new  Payment(1, "MP021024T9989415", "IFMS");
	 payObjArray[1]=new  Payment(4, "MP021024T9989414", "IFMV");
	 payObjArray[2]=new  Payment(3, "MP021024T9989413", "IFMU");
	 payObjArray[3]=new  Payment(2, "MP021024T9989411", "IFMT");
	 
	 Arrays.sort(payObjArray);
	 System.out.println("Natural Short "+Arrays.toString(payObjArray) );
	 
	 
	 Arrays.sort(payObjArray,Payment.paymentIdComapre);
	 System.out.println("Short "+Arrays.toString(payObjArray) );
	 
	 
	 Arrays.sort(payObjArray,Payment.paymentGatewayComapre);
	 System.out.println("Short By Payment gateway: "+Arrays.toString(payObjArray));
 }
}
