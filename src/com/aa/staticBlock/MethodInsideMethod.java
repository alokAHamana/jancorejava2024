package com.aa.staticBlock;

public class MethodInsideMethod {
	
	static {
		System.out.println("Static block-------");
	}

	public static void test() {
		System.out.println("test Method");
	}


	public static void cover() {
		System.out.println("cover Method");
	test();
	}

	public static void main(String[] args) {
		System.out.println("main method");
		test();
		cover();
	}




}

