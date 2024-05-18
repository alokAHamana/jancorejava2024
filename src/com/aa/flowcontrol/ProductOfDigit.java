package com.aa.flowcontrol;

public class ProductOfDigit {

	public static void main(String[] args) {

		int num = 12345;
		int remdr = 0;
		int product = 1;
		while (num > 0) {

		 remdr = num % 10; //12345%10=5 /1234%10=4 / 123%10=3 /12%10=2 /1%10=1

			product = product * remdr;// 1*5=5 / 5*4=20 /20*3=60 /60*2=120 /120*1=120

			num = num / 10;           // 1234/10=123 ,  123/10=12,  12/10=1, 1/10=1

		}
		System.out.println(product);
	}
}
   // output =120