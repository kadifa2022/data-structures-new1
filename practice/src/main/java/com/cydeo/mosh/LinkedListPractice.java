package com.cydeo.mosh;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListPractice {

    public static void main(String[] args) {

        LinkedList  list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        System.out.println(list.contains(10));// boolean expression T/F
        System.out.println(list.indexOf(10));// returns index of item
        System.out.println(list.size());// How many elements are stored in list
        var array = list.toArray();// convert linked list to regular array
        System.out.println(Arrays.toString(array));
    }
}
