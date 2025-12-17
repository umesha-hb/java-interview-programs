package com.uttara.datastructure.implementation;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DectectAndRemoveLoopLinkedList {

    // Detect and remove loop
    public static void removeLoop(Node head) {
        Node slow = head;
        Node fast = head;
        boolean loopExists = false;

        // Step 1: Detect loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                loopExists = true;
                break;
            }
        }

        // Step 2: If loop exists, remove it
        if (loopExists) {
            slow = head;

            // Special case: loop starts at head
            if (slow == fast) {
                while (fast.next != slow) {
                    fast = fast.next;
                }
            } else {
                // Move both pointers until they meet at start of loop
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
            }

            // Step 3: Break the loop
            fast.next = null;
            System.out.println("Loop removed from the linked list.");
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }

    // Print linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next; // creates a loop (2 -> 3 -> 4 -> 2)

        removeLoop(head);   // Detect and remove loop

        printList(head);    // Print list after loop removal
    }
}
