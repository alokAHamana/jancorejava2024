package com.aa.SingletonClass.normalClass;


public class Main_Emp {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();

		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
	}
}
//output: different output
/*
 * 1510467688 
 * 1995265320 
 * 746292446
 */