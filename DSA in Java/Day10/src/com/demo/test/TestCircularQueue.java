package com.demo.test;
import com.demo.stacks.CircularQueue;

public class TestCircularQueue {

	public static void main(String[] args) {
			CircularQueue cqueue = new CircularQueue(5);
			cqueue.enQueue(23);
			cqueue.enQueue(73);
			cqueue.enQueue(283);
			cqueue.enQueue(45);
			cqueue.enQueue(14);
			cqueue.enQueue(20);
			System.out.println(cqueue.deQueue());
	}

}
