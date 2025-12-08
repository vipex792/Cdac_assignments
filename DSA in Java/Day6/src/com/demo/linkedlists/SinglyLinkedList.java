package com.demo.linkedlists;

public class SinglyLinkedList {
	//Node is a data type and head is a variable
	//initialized before class node Doesnt matter if created before inner class Node
	//because it is inside the one outer class	
	Node head;
	
	//inner class
	class Node{
		int data;
		Node next;
		//inner class constructor
		public Node(int data) {
			this.data = data;
			next = null;
		}
	
	} 
	
	//constructor
	public SinglyLinkedList() {
		head = null;
		}
	
	//adding value after given num
	public void addByNum(int value, int num) {
		Node newNode = new Node(value);
		Node temp = head;
		
		while(temp!=null && temp.data!=num) {
			temp = temp.next;
		}
		
		if(temp!=null) {
			newNode.next=temp.next;
			temp.next=newNode;
		}
		
		else {
			System.out.println(num+"Not Found");
		}
		
	}
	
	//addbyposition
	public void addByPosition(int pos, int value)
	{
		//creation of new node
		Node newNode = new Node(value);
		
		//here no indexing concept so assuming the first node is at pos=1
		if(pos==1) {
			newNode.next= head;//first link to starting node .Now both head and newNode is pointing to first present node
			head = newNode;//linking head to newNode so that the link from head and initial first node breaks
		}
		
		else {
			//placing the node temp on head
			Node temp = head;
			
			// Move 'temp' to the node immediately *before* the target insertion position.
			// We need (pos - 2) steps to move from position 1 to position (pos - 1).
			for(int i = 1;temp!=null && i<=pos-2;i++) {
				temp=temp.next;
			}
			if(temp!=null) {
				newNode.next =temp.next;
				temp.next= newNode;
			}
			else {
				System.out.println("Given Pos"+pos+"Is the beyond limit");
			}
			
		}
		
	}
	
	
	//add at the end
	public void addNode(int value) {
		Node newNode = new Node(value);
		if(head==null) {
			head=newNode;
		}
		
		else {
			Node temp = head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			
			temp.next=newNode;
		}
	}
	
	
	public void displayData() {
		if(head==null) {
			System.out.println("List is empty");
		}
		
		else {
			for(Node temp=head; temp!=null;temp=temp.next) {
				System.out.println(temp.data+ "----->");
			}
			
			System.out.println("null");
		}
	}
}
	

