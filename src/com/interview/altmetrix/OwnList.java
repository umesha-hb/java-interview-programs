package com.interview.altmetrix;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class OwnList {
    private Node head;
    private int size;

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

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    private void remove(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            size--;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next.data == data) {
            current.next = current.next.next;
        }
    }
    public void  insertToSpecificPosition(int position,int data)
    {
        Node newNode = new Node(data);
        // Insert at beginning
        if (position == 1) {
            newNode.next = head;
        }

    }

    public static void main(String args[]) {
        OwnList ownList = new OwnList();
        for (int i = 1; i < 10; i++) {
            ownList.add(i);
        }
        ownList.printList();
        ownList.insertToSpecificPosition(8,100);
        ownList.insertToSpecificPosition(9,200);
        ownList.printList();


    }



}
