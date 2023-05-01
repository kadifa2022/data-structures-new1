package com.cydeo.day39_collections;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        System.out.println("----------------------Array list------------------------------");


        ArrayList<Integer> arrayList = new ArrayList<>();// arrayBased class-> get() fester (retrieving elements)
         arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.get(0);
        arrayList.remove(1);
        System.out.println(arrayList);

        System.out.println("----------------------LinkedList---------------------------------");

        LinkedList<Integer> linkedList = new LinkedList<>();// node based class (Double linked list)add(), addAll(), remove(), removeAll
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.remove(1);
        linkedList.get(0);

        System.out.println(linkedList);


        System.out.println("------------------------Vector class -----------------------");
        //Synchronized

        Vector<Integer> vector= new Vector<>();
        vector.add(100);
        vector.add(200);
        vector.add(300);

        vector.get(1); //get()

        System.out.println(vector);

        System.out.println("-----------------------------Stack Class--------------------" );
        //Synchronized
        Stack<Integer> stack = new Stack<>(); // uniq order LIFO Last in first out

        stack.add(100);
        stack.add(200);
        stack.add(300);
        stack.add(400);

        System.out.println(stack);

        int lastElement = stack.pop();// after calling pop() last object will be removed from stack

        System.out.println(stack);

        int secondElement= stack.pop();
        System.out.println(stack);









   //ListI Interface-> get() has been overridden in ArrayLis, LinkedList, Vector and Stack
    // for each  has different implementation


        // Linked list has node/ every single elements are stored as node
        //  has two pointer next/ previous// retrieving elements slower
        // advantage -> inserting or deleting faster

        /*
           Collection:
            List:
        ArrayList class :
        Internally using Arrays

        LinkedList  class:

        Vector class:
        same as ArrayList except is synchronized -> one threat at time get executed/ slower
        Internally uses Arrays, has get()


         Process is instance of program/ application that is running on your computer (execution time CPU)// has code, data , heap and other segments
        Threat is a subset of a process, A sequence of execution within process, Every single process at least have one threat, shares all the resources of process
        Multi - threading : Two or more threats are being executed within the process at the same time
        Two ways of creating multi-threading in Java:
        1. Threat Class
        2. Runnable Interface
        Stack class:
        stack is child class of Vector that's mean also synchronized



        */

    }
}
