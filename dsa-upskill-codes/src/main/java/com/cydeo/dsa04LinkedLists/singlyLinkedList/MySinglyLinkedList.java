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
    void deleteById(int id){
        //check if is empty list
        if(isEmpty()) System.out.println("List is empty");
        // assign prev and current with the head
        Node prev = head;
        Node current = head;
        // while loop to start looping if is not empty list
        while (current != null){
            // if the current id == id // there is match continue
            if(current.id ==id){
                // need to handle 3 cases and decrease size --
                if(current == head){
                    head=current.next;
                    current.next=null;
                }
               else if(current==tail){
                    tail = prev;
                    prev.next=null;
                }
               else{
                   prev.next = current.next;
                   current.next= null;
                }
               size--;

            }
            // after deletion move to next node
            prev= current;
            current=current.next;
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