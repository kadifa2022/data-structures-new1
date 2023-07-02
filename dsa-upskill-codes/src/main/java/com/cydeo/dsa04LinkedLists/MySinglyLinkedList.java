package com.cydeo.dsa04LinkedLists;

public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int data) {
        // create new object from data
        Node node = new Node(data);
        //case 1: list Empty
        if (isEmpty()) {
            head = tail = node;
        } else {// case 2: if is not empty
            node.next = head;
            head = node;
        }
        size++;// increase size

    }

    public int getKthItemFromLast(int k){
        // create 2 pointers
        Node ptr1 = head;
        Node ptr2 = head;

        //move ptr2 k-1  times
        for (int i = 0; i<k-1; i++){
            ptr2 = ptr2.next;
        }
        //move both pointers until ptr2 hits the last element
        while(ptr2.next != null){
            ptr1= ptr1.next;
            ptr2= ptr2.next;
        }
        //ptr1 is on the kth element from the last
        return ptr1.id;
    }

    public void removeKthItemFromLast(int k){
        //create 3 pointers
        Node ptr1 = head;
        Node ptr2 = head;
        Node prev = null;
        //move pth2 k-1 times
        for (int i = 0; i < k-1; i++) {
            ptr2 = ptr2.next;
        }
        //move both pointers until prt2 hits the last element
        while(ptr2.next != null){
            prev=ptr1;
            ptr1=ptr1.next;
            ptr2= ptr2.next;
        }
        //ptr1 is on the kth element from the last
        //do delete operation
        if(ptr1==head){
            head=ptr1.next;
            ptr1.next= null;
            size--;
        }else if(ptr1==tail){
            tail= prev;
            prev.next=null;
            size--;
        }else{
            prev.next=ptr1.next;
            ptr1.next=null;
            size--;
        }

    }

    void add(int data){
        // create a new node object from data
        Node node = new Node(data);
        if (isEmpty()) {// if the list is empty
            head = tail = node;
            size++;
        }else{//if there are elements in  list
            tail.next= node;
            tail = node;
            size++;
        }
    }























}




















