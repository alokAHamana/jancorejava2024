package com.aa.collection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> que = new PriorityQueue<>();// FiFO
		
		que.add("alok");
		que.add("anav");
		que.add("yash");
		
		System.out.println(que);
		
		//remove FIFO   -- this remove elements added first
		que.remove();
	System.out.println(que);
		
	}
}
