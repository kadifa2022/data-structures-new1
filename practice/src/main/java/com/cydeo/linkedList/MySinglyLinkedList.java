package com.cydeo.linkedList;

public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        //create a new object from data

        Node node = new Node(data);
        if (isEmpty()) {//if the list empty
            head = tail = node;
            size++;
        } else {//if there are elements in list
            tail.next = node;
            tail = node;
            size++;

        }
    }

    void printNodes() {
        Node current = head;
        while (current != null) {
            if (current.next == null) System.out.println(current.id + "=>null");
            else {
                System.out.print(current.id + "=>");
            }
            current = current.next;
        }


    }
}