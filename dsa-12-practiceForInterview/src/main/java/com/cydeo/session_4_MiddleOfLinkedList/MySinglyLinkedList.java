package com.cydeo.session_4_MiddleOfLinkedList;

public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty(){
        return head==null;
    }

    void add(int data){
        //create new node object from data
        Node node= new Node(data);
        if (isEmpty()) {//if the list isEmpty
            head=tail=null;
            size++;
        }else{//if there are elements in the list
            tail.next=node;
            tail=node;
            size++;
        }
    }

}
