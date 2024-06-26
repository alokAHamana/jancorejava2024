package com.aa.collection.List_comparator;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapa_Mycomparator {

	public static void main(String[] args) {

		TreeMap<Integer, String> treeSet = new TreeMap<Integer, String>(new MyComparator());

		treeSet.put(10, "abhi");
		treeSet.put(5, "aaa");
		treeSet.put(2, "bb");
		treeSet.put(15, "nn");
		treeSet.put(3, "lllp");

		// System.out.println(treeSet);

		Iterator<Map.Entry<Integer, String>> itr = treeSet.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> mp = itr.next();
			// System.out.println(mp);
			System.out.println(mp.getKey() + " , " + mp.getValue());
		}
		
		System.out.println("=====second method of iterator=====");
		
		Iterator<Map.Entry<Integer, String>> itr2 = treeSet.entrySet().iterator();
    	while(itr2.hasNext()) {
    		System.out.println(itr2.next());
    	}
		
	}
}
