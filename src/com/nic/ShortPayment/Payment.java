package com.nic.ShortPayment;

import java.util.Comparator;

public class Payment implements Comparable<Payment>{
  private int slno;
  private String paymentgateway;
  private String paymentId;
public int getSlno() {
	return slno;
}
public void setSlno(int slno) {
	this.slno = slno;
}
public String getPaymentId() {
	return paymentId;
}
public String getPaymentgateway() {
	return paymentgateway;
}
public void setPaymentgateway(String paymentgateway) {
	this.paymentgateway = paymentgateway;
}

public void setPaymentId(String paymentId) {
	this.paymentId = paymentId;
}
public Payment(int slno, String paymentId, String paymentgateway) {
	super();
	this.slno = slno;
	this.paymentId = paymentId;
	this.paymentgateway=paymentgateway;
}

public int hashcode() {
	return getSlno();
}


@Override
public String toString() {
	return "Payment [slno=" + slno + ", paymentgateway=" + paymentgateway + ", paymentId=" + paymentId + "]";
}
@Override
public int compareTo(Payment o) {
	
	return this.slno-this.slno;
}

public static Comparator<Payment> paymentIdComapre=new Comparator<Payment>() {//anonymous Class
	
	@Override
	public int compare(Payment p1, Payment p2) {
		return p1.getPaymentId().compareTo(p2.paymentId);
	}
};

public static Comparator<Payment> paymentGatewayComapre=new Comparator<Payment>() {//anonymous Class
	
	@Override
	public int compare(Payment p1, Payment p2) {
		return p1.getPaymentgateway().compareTo(p2.getPaymentgateway());
	}
};
  
}
