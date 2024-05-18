package com.aa.StaticMethod_In_Interface;

public interface A {
	static void M1() {
		System.out.println("interface static method");
	} 
		default void m2() {
			System.out.println("default method of Interface");
	}
}
 class Myclass implements A {
	public static void main(String[] args) {
		
		Myclass obj = new Myclass();
	//obj.M1();     // we can not call interface static method by obj reference
	//Myclass.M1(); //  we can not call By class name rather it is static method
		A.M1();  // we can call it only by interface name
	
	obj.m2();   // we can call default method by obj reference
	}
	
}
