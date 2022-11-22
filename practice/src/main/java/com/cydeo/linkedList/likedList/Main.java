package com.cydeo.linkedList.likedList;

import com.cydeo.day2_arrays.Array;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //adding elements to liked list
        LinkedList list= new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
       // list.remove(1);

      //  System.out.println(list.contains(10)); //T/F
        System.out.println(list.indexOf(10));
        System.out.println(list.size());
        var array=list.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(list);
    }

}
