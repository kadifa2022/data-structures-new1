package com.cydeo.dsa04LinkedLists.singlyLinkedList;

public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        //create a new node object from data
        Node node = new Node(data);
        // check if list is empty
        if (isEmpty()) {
            head = tail = node;
            size++;
        } else {// if there are elements in the list we are adding to the end
            tail.next = node;
            tail = node;
            size++;
        }

    }

    void printNodes() {
        Node current = head;//starting from head
        while (current != null) { // while loop
            if (current.next == null) System.out.println(current.id + " null"); // if is last element just adding id and null
            else {
                System.out.print(current.id + "=>");
            }
            current = current.next;

        }
    }
}