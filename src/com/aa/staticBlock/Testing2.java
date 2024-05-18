package com.aa.staticBlock;

public class Testing2 {
	
	static {
		System.out.println("Static block");
	}

	{
		System.out.println("Instance Block");
	}
	
	Testing2(){
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		new Testing2();                     // here we created object 
	}
}
