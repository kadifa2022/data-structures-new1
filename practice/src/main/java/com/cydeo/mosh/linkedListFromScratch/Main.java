package com.cydeo.mosh.linkedListFromScratch;

public class Main {
    public static void main(String[] args) {
//        java.util.LinkedList<String> x = new java.util.LinkedList<>();
//        x.removeFirst();// NoSuchElementException

        var  list = new LinkedList(); // var to simplify this code
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
       // list.removeFirst();// NullPointerException
        list.removeLast();
        System.out.println(list.indexOf(40));
        System.out.println(list.contains(10));




    }


}
