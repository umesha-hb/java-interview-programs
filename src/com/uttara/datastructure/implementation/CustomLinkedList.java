package com.uttara.datastructure.implementation;

//Java program to detect and remove loop in linked list

public class CustomLinkedList {

	private Node head;
	private int size;

	// Add element at end
	public void add(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
		size++;
	}

	// Add element at beginning
	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		size++;
	}

	// Remove first element
	public void removeFirst() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		head = head.next;
		size--;
	}

	// Remove element by value
	public void remove(int data) {
		if (head == null) return;

		if (head.data == data) {
			head = head.next;
			size--;
			return;
		}

		Node current = head;
		while (current.next != null && current.next.data != data) {
			current = current.next;
		}

		if (current.next != null) {
			current.next = current.next.next;
			size--;
		}
	}

	// Get element at index
	public int get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}

		Node current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current.data;
	}

	// Display list
	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}

	// Size of list
	public int size() {
		return size;
	}



	// Driver program to test above functions

		public static void main(String[] args) {

			CustomLinkedList list = new CustomLinkedList();


			list.add(10);
			list.add(20);
			list.add(30);
			list.addFirst(5);

			list.display(); // 5 -> 10 -> 20 -> 30 -> null

			list.remove(20);
			list.display(); // 5 -> 10 -> 30 -> null

			System.out.println("Element at index 2: " + list.get(2));
			System.out.println("Size: " + list.size());
		}


}

