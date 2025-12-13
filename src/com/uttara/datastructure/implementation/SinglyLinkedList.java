package com.uttara.datastructure.implementation;

public class SinglyLinkedList {
	private Node head;
	 
    public boolean isEmpty() {
        return (head == null);
    }
 
    // used to insert a node at the start of linked list
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = head;
        head = newNode;
    }
 
    // used to delete node from start of linked list
    public Node deleteFirst() {
        Node temp = head;
        head = head.nextNode;
        return temp;
    }
 
    // Use to delete node after particular node
    public void deleteAfter(Node after) {
        Node temp = head;
        while (temp.nextNode != null && temp.data != after.data) {
            temp = temp.nextNode;
        }
        if (temp.nextNode != null)
        	temp.nextNode = temp.nextNode.nextNode;
    }
 
    // used to insert a node at the start of linked list
    public void insertLast(int data) {
        Node current = head;
        while (current.nextNode != null) {
            current = current.nextNode; // we'll loop until current.next is null
        }
        Node newNode = new Node();
        newNode.data = data;
        current.nextNode = newNode;
    }
	  public int  detectAndRemoveLoop(Node node)
	  {
		  Node slow = node, fast = node;
		  while(slow != null && fast != null && fast.nextNode != null)
		  {
			  slow = slow.nextNode;
			  fast = fast.nextNode.nextNode;
		  }
		  if(slow == fast)
		  {
			  return 1;
		  }
		  return 0;
	  }
    // For printing Linked List
    public void printLinkedList() {
        System.out.println("Printing LinkedList (head --> last) ");
        Node current = head;
        while (current != null) {
            current.displayNodeData();
            current = current.nextNode;
        }
        System.out.println();
    }
    public static void main(String ags[]) {
    	SinglyLinkedList linkedList = new  SinglyLinkedList();
    	linkedList.insertFirst(10);
    	linkedList.deleteFirst();
    	linkedList.insertFirst(10);
    	linkedList.insertLast(20);
    	linkedList.insertLast(30);
    	linkedList.insertLast(40);
    	linkedList.insertLast(50);
    	linkedList.insertFirst(60);
    	linkedList.printLinkedList();
    	Node node=new Node();
    	node.data=20;
    	linkedList.deleteAfter(node);
    	linkedList.printLinkedList();
    	//creating loop
    	linkedList.head.nextNode.nextNode.nextNode.nextNode.nextNode = linkedList.head;
    	System.out.println("loop=="+linkedList.detectAndRemoveLoop(node));
    }
}
class Node
{
	public int data;
	public Node nextNode;
	public void displayNodeData()
	{
		System.out.println("{"+data+"}");
	}
	
}
