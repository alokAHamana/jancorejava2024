package com.aa.collection.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LikedListAllMethod {

		public static void main(String[] args) {

			LinkedList<String> arr = new LinkedList<>();
			
			arr.add("Ram");
			arr.add("Shyam");
			arr.add("Mohan");
			
			System.out.println(arr);
			
			//add elements at first or last 
			arr.addFirst("alok");
			arr.addLast("anav");
			System.out.println(arr);
			
			// insertion and deletion in middel or at perticular index
			arr.add(1, "Ali");
			System.out.println(arr);
			
			//remove elements --this remove elements from begning by default
			arr.remove();
			System.out.println(arr);
			
			//remove perticular
			arr.removeFirst();
			arr.removeLast();
			System.out.println(arr);
			
			// for traversing allways use advance for each and iterator
		for( String str:arr) {
			System.out.println(str);
		}
			
		Iterator itr = arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
}
}