package com.aa.collection.List;

import java.util.ArrayList;

public class AllOperationInArrayList {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("Ram");
		arr.add("Shyam");
		arr.add("Mohan");
		
		System.out.println(arr);
		//add element in middle or at perticular index
		arr.add(1, "Kanha");
		System.out.println(arr);
		
		// add element in starting
		arr.add(0, "Mahadev");
		System.out.println(arr);
		
		// remove any elemnts(one by one)  ;  delte all elemts by clear()
		arr.remove(2);
		System.out.println(arr);
		
		// replace elements   by set() method 
		arr.set(0, "Bhole");  System.out.println(arr);
	}

}
