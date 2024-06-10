package com.aa.collection.List;

import java.util.ArrayList;

public class ArrayListDemo {

	
	public static void main(String[] args) {
		
		ArrayList arlist= new ArrayList();
		
		arlist.add("Alok");
		arlist.add("satish");
		arlist.add("Alok");
		arlist.add(20);
		arlist.add(null);
		
		System.out.println(arlist.size());
		System.out.println(arlist);
		System.out.println(arlist.contains(20));

	}
}
