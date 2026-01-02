package com.java2novice.stat.imp.pac2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class StackExample {
	public static void main(String[] args) {
		stackStyle();
		System.out.println("===================");
		queueStyle();
		System.out.println("*********************");
		
		PriorityQueueTest();
	}

	private static void PriorityQueueTest() {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.add(30);
		pq.add(10);
		pq.add(20);
		
		System.out.println(pq);

		System.out.println(pq.peek()); // 10 Retrieve head(smallest) of queue. doesn't remove
		System.out.println(pq.poll()); // 10 Retrieve & remove head(smallest) of queue
		System.out.println(pq.poll()); // 20
		System.out.println(pq);        // [30]
	}

	private static void stackStyle() {
		// Stack style FIFO
		Deque<Integer> deque = new ArrayDeque<>();
		deque.push(10);
		deque.push(20);
		deque.push(30);
		deque.push(40); //add element in head [40, 10, 20, 30]
		System.out.println(deque);
		System.out.println(deque.pop());  //40  removes, returns the first element of this deque. 
		System.out.println(deque); //[10, 20, 30]
		
		addBothSide(deque);
	}

	private static void queueStyle() {
		Deque<Integer> deque = new ArrayDeque<>();
		// Queue style
		deque.add(10);
		deque.add(20);
		deque.add(30);
		System.out.println(deque.poll()); // 10 Retrieves and removes the head of the queue 
		System.out.println(deque);
		addBothSide(deque);
	}
	
	private static void addBothSide(Deque<Integer> deque) {
		deque.addFirst(5);
		deque.addLast(50);
		System.out.println(deque);
	}
}
