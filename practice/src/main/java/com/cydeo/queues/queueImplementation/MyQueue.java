package com.cydeo.queues.queueImplementation;

import java.util.NoSuchElementException;

public class MyQueue <T> {
    QNode<T> front;
    QNode<T> back;
    int size;

    boolean isEmpty() {
        return front == null;
    }

    T peek() {
        return (T) front.value;
    }

    void enqueue(T item) {
        QNode<T> node = new QNode<>(item);
        if (isEmpty())
            front=back=node;
        else{
            back.next=node;
            back=node;
        }
        size++;

    }

    T dequeue(){
        QNode frontNode;//removing first element from collection
        if(isEmpty()) throw new NoSuchElementException();

        //for one element
        if(front==back){
            frontNode=front;
            front=back=null;
        }
        else{
            frontNode=front;
            front=frontNode.next;//new node
        }
        size--;
        return(T)frontNode.value;


    }
    int size(){
        return size;
    }
        void  printQueue(){
        if(isEmpty()) return;
        QNode<T> current=front;
        while(current!=null){
            System.out.println(current.value);
            if(current.next!=null) System.out.println(", ");
            current=current.next;
        }
        }





}
