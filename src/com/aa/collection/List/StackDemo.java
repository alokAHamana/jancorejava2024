package com.aa.collection.List;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> arr = new Stack<>();  // LIFO
		
		arr.push("Ram");
		arr.push("Shyam");
		arr.push("Mohan");
		
		System.out.println(arr);
	
		arr.pop();   // this work on LIFO last in first out 
		System.out.println(arr);
		
		//[Ram, Shyam, Mohan]
	    //[Ram, Shyam]      // here last added is mohan , it is removed first

	
	}
}
