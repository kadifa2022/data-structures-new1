package com.cydeo.collection_queues;

import java.util.NoSuchElementException;

public class MyQueue<T> {
    QNode<T> front;
    QNode<T> back;

    int size;

    boolean isEmpty(){//if front is null q is empty
                 return front ==null;
    }
    T peek(){
        return (T)front.value;
    }
    void enqueue(T item){//add elements //added one element on the back
        QNode<T>node =new QNode<>(item);
        if(isEmpty())
            front = back=node;
        else {
            back.next=node;
            back=node;
        }
        size++;
    }
    T dequeue(){ //removing first element from collection--front and back pointing to the null if we have only one element

        QNode frontNode;

        if(isEmpty()) throw  new NoSuchElementException();
        //for one element in queue
        if(front==back){ //we can assign also if is size==1//we have size()
            frontNode=front;
            front=back=null;
        }    //now i have more than one element
        else{
            frontNode=front;
            front=front.next; //new node
        }
        size--;
        //before returning value
      return (T) frontNode.value;
    }
    int size(){
        return size;
    }
    //methods: peek()-dequeue()-removing item -add() -isEmpty()-enqueue()-add method
    void printQueue(){
        if (isEmpty()) return;
        QNode<T> current=front;
        while (current!=null){
            System.out.print(current.value);
            if (current.next!=null) System.out.print(", ");
            current=current.next;
        }
    }

}
