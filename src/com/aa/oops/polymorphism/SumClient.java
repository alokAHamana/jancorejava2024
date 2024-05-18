package com.aa.oops.polymorphism;

public class SumClient {

	public static void main(String[] args) {

		Sum s1 = new Sum();

		System.out.println(s1.sum(10, 20));

		System.out.println(s1.sum(10, 20, 30));

	}

}