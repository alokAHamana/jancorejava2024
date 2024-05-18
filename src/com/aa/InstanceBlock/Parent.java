package com.aa.InstanceBlock;

public class Parent {

	int x = 10;

	{
		m1();

		System.out.println("First Instance Block");

	}

	Parent() {

		System.out.println("Constructor");

	}

	public static void main(String[] args) {

		Parent parent = new Parent();

		System.out.println("main");

	}

	public void m1() {
		System.out.println(y);
	}

	{
		System.out.println("Second Instance Block");
	}

	int y = 20;

}