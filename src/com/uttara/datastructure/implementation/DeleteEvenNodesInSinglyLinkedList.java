package com.uttara.datastructure.implementation;

class SinglyLinkedList
{
    int data;
    SinglyLinkedList next;
    SinglyLinkedList(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class DeleteEvenNodesInSinglyLinkedList {
    public static SinglyLinkedList deleteEven(SinglyLinkedList listHead)
    {
        //  Dummy node to handle head deletion
        SinglyLinkedList dummy = new SinglyLinkedList(0);
        dummy.next=listHead;
        SinglyLinkedList current=dummy ;
        while(current.next!=null)
        {
            if(current.next.data%2==0) {
                // Skip even node;
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }

        return dummy.next;
    }
    public static void printList(SinglyLinkedList listHead){
        SinglyLinkedList temp = listHead;
        while(temp!=null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(1);
        singlyLinkedList.next = new SinglyLinkedList(2);
        singlyLinkedList.next.next=new SinglyLinkedList(3);
        singlyLinkedList.next.next.next=new SinglyLinkedList(4);
        singlyLinkedList.next.next.next.next=new SinglyLinkedList(5);
        singlyLinkedList.next.next.next.next.next=new SinglyLinkedList(6);
        DeleteEvenNodesInSinglyLinkedList.printList(singlyLinkedList);
        SinglyLinkedList deleteEvenLinkedList = DeleteEvenNodesInSinglyLinkedList.deleteEven(singlyLinkedList);
        DeleteEvenNodesInSinglyLinkedList.printList(deleteEvenLinkedList);
    }
}
