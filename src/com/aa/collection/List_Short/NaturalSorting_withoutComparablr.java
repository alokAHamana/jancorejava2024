package com.aa.collection.List_Short;

import java.util.ArrayList;
import java.util.Collections;

public class NaturalSorting_withoutComparablr {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(25);
		arr.add(5);
		arr.add(55);
		arr.add(10);
		
	System.out.println("original:"+arr);
	
	Collections.sort(arr);
	
	System.out.println(arr);
}
}