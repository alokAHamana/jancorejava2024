package com.aa.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Iterate2 {
	
	public static void main(String[] args) {
		
		Map<Integer,String> hashmap = new HashMap<>();  //interface ke reference mein implementation class ka Object banaya hai
		
		hashmap.put(1, "Ram");
		hashmap.put(2, "Shyam");
		hashmap.put(3, "Mohan");
		hashmap.put(4, "Bharat");
		hashmap.put(6, "Balram");
		
		
//    System.out.println(hashMap);
        //Iterate using Iterator
   
		Iterator<Map.Entry<Integer,String>> itr1= hashmap.entrySet().iterator();
		
		while(itr1.hasNext()) {
			Map.Entry<Integer, String> mapentry= itr1.next();
			
			System.out.println(mapentry.getKey()+" "+ mapentry.getValue());
		}
		
		// Itetrate using java 8
		System.out.println("Iterate using java 8 - forEach");
		
		hashmap.forEach((key,value)-> {System.out.println(key+" "+ value);});
	}
}
