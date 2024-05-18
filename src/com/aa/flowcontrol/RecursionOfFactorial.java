package com.aa.flowcontrol;


public class RecursionOfFactorial {
	static int fact = 1;

	public static void main(String[] args) {

		int no = 5;
		
		calcFact(no);
	}

	public static void calcFact(int no) {
		if (no >= 1) {
			fact = fact * no;
			calcFact(no - 1);
			System.out.println(fact);
		}
	}

}