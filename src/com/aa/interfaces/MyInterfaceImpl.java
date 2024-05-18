package com.aa.interfaces;

public class MyInterfaceImpl implements MyInterface {

	@Override
	public void m1() {
		System.out.println("Hello world");
	}
	
	public static void main(String[] args) {

		MyInterfaceImpl myInterfaceImpl = new MyInterfaceImpl();
		
		myInterfaceImpl.m1();
	}

}
