package com.demo.trees; // Package declaration

public class MyBinarySearchTree { // Class representing a Binary Search Tree
    Node root; // Root node of the BST

    // Inner class representing a node in the BST
    class Node {
        int data; // Value stored in the node
        Node left; // Reference to left child
        Node right; // Reference to right child

        // Constructor to initialize a node with given data
        public Node(int data) {
            this.data = data;
            left = null; // Initially no left child
            right = null; // Initially no right child
        }
    } 
    
    

    // Constructor to initialize an empty BST
    public MyBinarySearchTree() {
        root = null;
    }
        
    
    
    
    
    // Public method to insert a new key into the BST
    public void insertNode(int key) {
        root = insertData(root, key); // Call recursive helper
    }
    
    // Recursive helper method to insert data into BST
    private Node insertData(Node root, int key) {
        Node newNode = new Node(key); // Create new node
        // Base case: if tree/subtree is empty, insert here
        if (root == null) {
            root = newNode;
            return root;
        } 
        
        else {
            // If key is smaller, go to left subtree
            if (key < root.data) {
                root.left = insertData(root.left, key)
                		;
            } 
            else { // If key is greater or equal, go to right subtree
                root.right = insertData(root.right, key);
            }
            return root; // Return updated root
        }
    }
    
    
    
    
    
    // Public method to perform inorder traversal
    public void inorder() {
        inorderTraversal(root);
        System.out.println(); // Print newline after traversal
    }

    // Recursive helper for inorder traversal (Left → Root → Right)
    private void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left); // Visit left subtree
            System.out.print(root.data + ", "); // Visit root
            inorderTraversal(root.right); // Visit right subtree
        }
    }
    
    
    
    // Public method to perform preorder traversal
    public void preorder() {
        preorderTraversal(root);
        System.out.println();
    }

    // Recursive helper for preorder traversal (Root → Left → Right)
    private void preorderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.data + ", "); // Visit root
            preorderTraversal(root.left); // Visit left subtree
            preorderTraversal(root.right); // Visit right subtree
        }
    }
    
    // Public method to perform postorder traversal
    public void postorder() {
        postorderTraversal(root);
        System.out.println();
    }

    // Recursive helper for postorder traversal (Left → Right → Root)
    private void postorderTraversal(Node root) {
        if (root != null) {
            postorderTraversal(root.left); // Visit left subtree
            postorderTraversal(root.right); // Visit right subtree
            System.out.print(root.data + ", "); // Visit root
        }
    }
    
    
    
    
    
    
    
    // Public method to delete a node with given key
    public void deleteNode(int key) {
        root = deleteData(root, key); // Call recursive helper
    }

    // Recursive helper to delete a node
    private Node deleteData(Node root, int key) {
        if (root == null) { // Base case: empty tree
            return root;
        }
        // Traverse to find the node
        if (key < root.data) {
            root.left = deleteData(root.left, key);
        } else if (key > root.data) {
            root.right = deleteData(root.right, key);
        } 
        else {
            // Found the node to delete
            // Case 1: Node is a leaf
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: Node has only one child
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Case 3: Node has two children
            root.data = minvalue(root.right); // Replace with inorder successor
            root.right = deleteData(root.right, root.data); // Delete successor
        }
        return root; // Return updated root
    }

    // Helper to find minimum value in a subtree (used for deletion)
    private int minvalue(Node root) {
        int min = root.data;
        while (root.left != null) { // Keep going left
            min = root.left.data;
            root = root.left;
        }
        return min;
    }
  
    
    
    // Public method to search for a key (recursive)
    public boolean search(int key) {
        return searchBinaryTree(root, key);
    }
    
  
    // Public method to search for a key (non-recursive)
    public boolean searchNonRecurssive(int key) {
        return searchBinaryTreeNonRecurssive(root, key);
    }
    

    // Iterative search method
    private boolean searchBinaryTreeNonRecurssive(Node root, int key) {
        if (root != null) {
            Node temp = root;
            while (temp != null) {
                if (temp.data == key) { // Found key
                    System.out.println(key + " data found");
                    return true;
                } 
                else if (key < temp.data) { // Go left
                    temp = temp.left;
                } else { // Go right
                    temp = temp.right;
                }
            }
        }
        System.out.println(key + " not found"); // Key not found
        return false;
    }
    

    // Recursive search method
    private boolean searchBinaryTree(Node root, int key) {
        if (root != null) {
            if (root.data == key) { // Found key
                System.out.println(key + " data found");
                return true;
            } 
            
            else if (key < root.data) { // Search left subtree
                return searchBinaryTree(root.left, key);
            } else { // Search right subtree
                return searchBinaryTree(root.right, key);
            }
        }
        
        //else
        System.out.println(key + " data not found"); // Key not found
        return false;
    }
}
