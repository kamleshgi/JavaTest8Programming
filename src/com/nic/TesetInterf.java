package com.nic;

public class TesetInterf implements A,B {

	public static void main(String args[]) {
		TesetInterf obj=new TesetInterf();
		obj.a();
		
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		A.super.a();
	}
	
	
}
