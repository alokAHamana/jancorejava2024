package com.aa.collection.Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> prq= new PriorityQueue<>();
	
		System.out.println(prq.peek());

		//System.out.println(prq.element());

		for(int i=1; i<=10; i++) {
			
			prq.offer(i);
		
		}
		System.out.println(prq);

		System.out.println(prq.poll());
		System.out.println(prq);

	}
}
