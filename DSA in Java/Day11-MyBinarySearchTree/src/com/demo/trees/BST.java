package com.demo.trees;

public class BST {
		Node root;
		
		
		class Node{
			int data;
			Node left ;
			Node right ;
			
			public Node(int data) {
				this.data=data;
				left=null;
				right=null;
			}
			
		}


		public BST() {
			root=null;
		}
		
	//public method
		public void insertNode(int key) {
			root = insertData(root,key);
		}

	private Node insertData(Node root, int key) {
		Node newNode = new Node(key);
		
		if(root==null) {
			root=newNode;
			return root;
		}
		
		else {
			if(key<root.data) {
				root.left = insertData(root.left,key);
			}
			else {
				root.right = insertData(root.right,key);
			}
			
			return root;
			
		}
	}
	
	public void inorder() {
		inorderTraversal(root);
		System.out.println();
	}

	private void inorderTraversal(Node root) {
		if(root !=null) {
			inorderTraversal(root.left);
			System.out.print(root.data + ", ");
			inorderTraversal(root.right);
		}
	}
	
	public void preorder() {
		preorderTraversal(root);
		System.out.println();
	}

	private void preorderTraversal(Node root) {
		if(root!=null) {
			System.out.print(root.data + ", ");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}
	
	public void postorder() {
		postorderTraversal(root);
		System.out.println();
	}

	private void postorderTraversal(Node root) {
		if(root!=null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.print(root.data, ", ");	
		}
		
	
	}
	
	
	//delete 
	public void deleteNode(int key) {
		root = deleteData(root,key);
	}

	private Node deleteData(Node root, int key) {
		
		if(root==null) {
			return root;
		}
		
		if(key<root.data) {
			root.left=deleteData(root.left,key);
		}
		
		else if(key>root.data) {
			root.right=deleteData(root.right,key);
		}
		
		else {
			//case 1
			if(root.left==null && root.right==null) {
				return null;
			}
			else if (root.left==null) {
				return root.right;
			}
			
			else if (root.right==null) {
				return root.left;
			}
			
			root.data=minvalue(root.right);
			root.right=deleteData(root.right,root.data);
			
		}
		
		return root;
	}

	
	private int minvalue(Node right) {
		int min = root.data;
		while(root.left !=null) {
			min=root.left.data;
			root=root.left;
		}
		
		return min;
		
	}
	
	
	public boolean search(int key) {
		return searchBinary(root,key);
	}
	
	
	private boolean searchBinary(Node root, int key) {
		
		if(root!=null) {
			if(root.data == key) {
				System.out.println(key + " data found");
				return true;
			}
			
			else if(key<root.data) {
				return searchBinary(root.left,key);
			}
			
			else if(key>root.data) {
				return searchBinary(root.right,key);
			}
			
		}
		
		System.out.println(key," data not found ");
		return false;
	}

	
	
	public boolean searchNonR(int key) {
		return searchNonR(root,key);
	}

	private boolean searchNonR(Node root, int key) {
		if(root != null) {
			Node temp = root;
			
			while (temp !=null) {
				if(temp.data==key) {
					System.out.println(key, " data found");
				}
				
				else if(key<temp.data) {
					temp = temp.left;
				}
				
				else{
					temp = temp.right;
				}
				
				
			}
		}
		
		System.out.println(key, " data not found ");
		return false;
	}
	
	
	
	
	
		

		
}
