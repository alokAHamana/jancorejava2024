package com.aa.staticBlock;

public class Testing {
	
	static {
		System.out.println("Static block");
	}

	{
		System.out.println("Instance Block");
	}
	
	Testing(){
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
	}
}
