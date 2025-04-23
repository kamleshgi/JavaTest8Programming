package com.nic.java8.defaultmethods;

public interface Sayable {
	// Default method
	default void say() {
		System.out.println("Test Default method");
	}
	// Abstract method
	void sayMore(String msg);

	// static method    
    static void sayLouder(String msg){    
        System.out.println(msg);    
    }    
}
