package com.cydeo.linkedList;

public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int data){
        //create a new node object from data
        Node node= new Node(data);
        //case!: list empty
        if(isEmpty()){
            head=tail=node;
        }else{//case2: list is not empty
        node.next=head;
            head=node;
        //increase size
            }
        size++;
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
    void deleteById(int id){
        //check if is empty
        if(isEmpty()) System.out.println("List is empty!!!");

        //assign prev and current with the head
        Node prev=head;
        Node current=head;

        while(current!=null){
            if(current.id==id){//there is a match
                //case1:head
                if(current==head){
                    head=current.next;
                    current.next=null;
                }
                //case2:tail
            else if(current==tail){
                tail=prev;
                prev.next=null;//ex-tail will be eligible for garbage collection
            }
                //case3: middle
            else{
                prev.next=current.next;
                current.next=null;//current will be eligible for garbage collection
                }
                //after deletion
            size--;
        }
          //move forward of the elements of the list
        prev=current;
        current=current.next;
    }
    }
    int indexOf(int id) {
        if (isEmpty()) return -1;
        int pos=0;
        //iterate through the list
        Node current=head;       //set my current with the starting element

        while(current!=null){
            if(current.id==id) return pos;
            pos++;
            current=current.next;
        }
        return -1;
    }
/*
1.Find the indexOf sn element and return it.//position
2. if not found return -1.

 */



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