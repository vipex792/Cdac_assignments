// Define the package where this class is located
package com.demo.hashing;

// Main class definition for our custom Hash Table implementation
public class MyHashTable {
    
    // The main array (or "buckets") where we store the starting point (head) 
    // of each linked list (chain)
    Node[] heads;
    
    // Inner class defining a Node (an element) for the linked lists
    class Node{
        // The actual integer data stored in this node
        int data;
        // Pointer to the next Node in the chain (used for collision handling)
        Node next;
        
        // Constructor for the Node
        public Node(int data) {
            // Initialize the data field with the provided value
            this.data = data;
            // Initially, the new node's pointer is set to null
            next=null;
        };
        
    }
    
    // Default constructor (initializes the table with 10 buckets)
    public MyHashTable() {
        // Create the array of Nodes with a default size of 10
        heads=new Node[10];
        // Loop through the array to prepare each bucket
        for(int i=0;i<heads.length;i++) {
            // Set the head of each linked list (bucket) to null initially
            heads[i]=null;
        }
    }
    
    // Overloaded constructor to create a hash table of a specified size
    public MyHashTable(int size) {
        // Create the array of Nodes with the size provided by the user
        heads=new Node[size];
        // Loop through the array to prepare each bucket
        for(int i=0;i<heads.length;i++) {
            // Set the head of each linked list (bucket) to null initially
            heads[i]=null;
        }
    }
    
    // Method to insert a new integer value into the hash table
    public void insertData(int val) {
        // Create a new Node object for the value to be stored
        Node newNode=new Node(val);
        
        // Apply the **Hash Function**: Modulo operator to find the bucket index
        int pos=val%heads.length;
        
        // **Collision Handling (Separate Chaining): Add at the beginning**
        
        // Check if the target bucket already has a list (a collision)
        if(heads[pos]!=null) {
            // If a list exists, the new node points to the current head of that list
            newNode.next=heads[pos];
        } 
        // Make the new node the new head of the linked list at that bucket index
        heads[pos]=newNode;
        
    }
    
    // Method to print the contents of the entire hash table
    public void displayHashTable() {
        // Loop through each bucket (index) in the hash table array
        for(int i=0;i<heads.length;i++) {
            // Start a temporary pointer at the head of the current bucket's list
            Node temp=heads[i];
            // Print the bucket index followed by a separator
            System.out.print(i+"--->");
            
            // Traverse the linked list (chain) in the current bucket
            while(temp!=null) {
                // Print the data in the current node followed by a separator
                System.out.print(temp.data+"----->");
                // Move the temporary pointer to the next node in the chain
                temp=temp.next;
            }
            // Indicate the end of the linked list for this bucket
            System.out.println("null");
        }
    }
    
    // Method to search for a specific integer value in the hash table
    public boolean searchData(int num) {
        // Calculate the bucket index using the hash function
        int pos=num%heads.length;
        
        // Start a temporary pointer at the head of the calculated bucket
        Node temp=heads[pos];
        
        // Traverse the linked list (chain) in the current bucket
        while(temp!=null) {
            // Check if the current node's data matches the search number
            if(temp.data==num) {
                // If found, print a success message
                System.out.println(num + " found in bucket "+pos);
                // Return true, indicating success and stopping the search
                return true;
            }
            // Move the temporary pointer to the next node in the chain
            temp=temp.next;
            
        }
        
        // If the loop finishes (temp becomes null) without finding the number
        System.out.println(num + " not found in bucket "+pos);
        // Return false, indicating failure
        return false;
    }
    
    
}