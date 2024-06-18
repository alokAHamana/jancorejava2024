package com.aa.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer ,String> treemap = new TreeMap<>();
		
		treemap.put(111,"alok");
		treemap.put(113, "yash");
		treemap.put(115, "ram");
		treemap.put(112, "shyam");
		treemap.put(110, "mohan");
		
		Iterator<Map.Entry<Integer,String>> itr = treemap.entrySet().iterator();

		while(itr.hasNext()) {
			
			Map.Entry<Integer, String> entry = itr.next();
			
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}
	}
}
