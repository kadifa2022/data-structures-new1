package com.cydeo.day39_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>();// arrayBased class-> get() fester (retrieving elements)
         arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.get(0);
        arrayList.remove(1);

        LinkedList<Integer> linkedList = new LinkedList<>();// node based class (Double linked list)add(), addAll(), remove(), removeAll
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.remove(1);
        linkedList.get(0);


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
        Process is instance of program that is running on your computer (execution time CPU)// has code, data , heap and other segments
        Threat is a subset of a process, A sequence of execution within process, Every single process at least have one threat, shares all the resources of process
        Multi - threading : Two or more threats are being executed within the process at the same time
        Two ways of creating multi-threading in Java:
        1. Threat
        Stack class:


        */

    }
}
