package com.aa.SingletonClass;

public class Main_Emp {

	public static void main(String[] args) {

		Employee e1 =  Employee.getInstance();
		Employee e2 =  Employee.getInstance();
		Employee e3 =  Employee.getInstance();

		System.out.println("Object1 :"+ e1);
		System.out.println("Object2 :"+ e2);
		System.out.println("Object3 :"+ e3);
	}
		//output : we will get same output of all 3 object
}
/*
 * Object1 :com.aa.SingletonClass.Employee@5a07e868 
 * Object2 :com.aa.SingletonClass.Employee@5a07e868 
 * Object3 :com.aa.SingletonClass.Employee@5a07e868
 */
