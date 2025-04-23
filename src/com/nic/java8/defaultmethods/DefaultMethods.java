package com.nic.java8.defaultmethods;

public class DefaultMethods implements Sayable{

	@Override
	public void sayMore(String msg) {
		System.out.println(msg);  	
	}
		
	public static void main(String[] args) {
		DefaultMethods defaultMethods=new DefaultMethods();
		defaultMethods.say();
		defaultMethods.sayMore("MY Test");

	}

}
