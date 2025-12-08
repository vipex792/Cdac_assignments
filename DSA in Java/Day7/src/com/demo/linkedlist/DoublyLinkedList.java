package com.demo.linkedlist;

public class DoublyLinkedList {

	Node head;

	class Node {
		int data;
		Node prev, next;

		public Node(int data) {
			this.data = data;
			prev = null;
			next = null;
		}
	}

	public DoublyLinkedList() {
		head = null;
	}

	public void addByValue(int val, int num) {
		Node newNode = new Node(val);

		Node temp = head;
		while (temp != null && temp.data != num) {
			temp = temp.next;

		}

		if (temp != null) {
			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next = newNode;
		}
		if (newNode.next != null) {
			newNode.next.prev = newNode;
		} else {
			System.out.println(num + "not found");
		}
	}

	public void addByPosition(int pos, int val) {
		Node newNode = new Node(val);

		if (pos == 1) {
			newNode.next = head;
			if (head != null) {
				head.prev = newNode;
				newNode = head;
			}
		}
		else {
			Node temp = head;

			for (int i = 1; temp != null && i < pos - 2; i++) {
				temp = temp.next;
			}
			if (temp != null) {
				newNode.next = temp.next;
				newNode.prev = temp;
				temp.next = newNode;

				if (newNode.next != null) {
					newNode.next.prev = newNode;
				}

				else {
					System.out.println(pos + "pos beyoond limit");
				}
			}

		}
		
	}
	
	public void deleteByValue(int val) {
		Node temp =h
				
				
				
				
	}
	
	
	
	
	public void addNode(int val) {
		Node newNode = new Node(val);
		
		if(head==null) {
			head=newNode;
		}
		
		else {
			Node temp = head;
			while(temp!=null) {
				temp=temp.next;
			}
			
			newNode.prev=temp;
			temp.next=newNode;
		}
	}
	
	public void displayDataReverse() {
		Node temp = head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		if(temp!=null) {
			System.out.print(temp.data+"--->");
			temp=temp.prev;
		}
	}
	
	
	public void displayData() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"--->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	
	
	
	
}
	
	

