package com.aa.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EmpTest {

	public static void main(String[] args) {
		
		HashMap<EmpCustom, String> hashmap= new HashMap<>();
	
		hashmap.put(new EmpCustom(1,"alok"),"india");
		hashmap.put(new EmpCustom(2,"ram"),"nepal");
		hashmap.put(new EmpCustom(3,"shyam"),"china");
		hashmap.put(new EmpCustom(5,"ashish"),"india");
		hashmap.put(new EmpCustom(4,"bharat"),"india");
	
		Iterator<Map.Entry<EmpCustom, String>> itr= hashmap.entrySet().iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry<EmpCustom, String>  map= itr.next();
			
			System.out.println(map.getKey()+" , "+map.getValue());
		}
	}
}
