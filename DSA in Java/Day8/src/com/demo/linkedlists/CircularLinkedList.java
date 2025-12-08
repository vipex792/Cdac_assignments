package com.demo.linkedlists;

public class CircularLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next=null;
		}
		
		
	} 
	
	
	public CircularLinkedList() {
		head=null;
	}
	
	public void addNode(int val) {
		//
		Node newNode = new Node(val);
		if(head==null) {
			head=newNode;
		}
		
		else {
			Node temp = head;
			while(temp.next!=head) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
		
		newNode.next=head;
		
	}
	
	public void addByPosition(int pos,int val) {
		if(head==null) {
			System.out.println("List is empty");
		}
		
		
		else {
			Node newNode = new Node(val);
			
			if(pos==1) {
				Node temp = head;
				while (temp.next!=head) {
					temp=temp.next;
				}
				newNode.next=head;
				head= newNode;
				temp.next=head;
			
			}
			else {
				Node temp = head;
				int i = 1;
				for(;temp.next!=head && i<pos-2;i++) {
					
				}
			}
		}
		
	}
	
	

}
