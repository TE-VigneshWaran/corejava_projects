package com.te.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueue {

	public static void main(String[] args) {
		// support duplicate,not support null
		Queue<Integer> queue = new PriorityQueue<Integer>();

		queue.add(5);
		queue.add(3);
		queue.add(2);
		queue.add(1);
		queue.add(4);

		System.out.println(queue);

		System.out.println(queue.poll());// remove the first element

		System.out.println(queue);

		System.out.println(queue.peek());// fetch the first element ,it support empty

		System.out.println(queue);

		System.out.println(queue.remove(2));// remove the mentioned element

		System.out.println(queue);

		System.out.println(queue.element());// fetch the first element ,it not support empty

		System.out.println(queue);

	}

}
