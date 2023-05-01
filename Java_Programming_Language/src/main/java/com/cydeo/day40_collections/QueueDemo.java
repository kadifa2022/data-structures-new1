package com.cydeo.day40_collections;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {
        System.out.println("-------------------------------PriorityQueue----------------------------");
        Queue<Integer> queue1 = new PriorityQueue<>();// has all methods from collections and unique method poll() FIFO
        queue1.addAll(Arrays.asList(10,20,200,300,40,90));// order random/ no null// no index// no get()
        queue1.addAll(Arrays.asList(10,20,200,300,40,90));
        queue1.addAll(Arrays.asList(10,20,200,300,40,90));
        queue1.addAll(Arrays.asList(10,20,200,300,40,90));
       // queue1.addAll(Arrays.asList(null, null,null,null,null,null));// DO NOT ACCEPT NULL KEYWORD
        System.out.println(queue1);

         int num1 = queue1.poll();//FIFO method of queue interface
        System.out.println(queue1);
        queue1.poll();
        queue1.poll();
        queue1.poll();
        System.out.println(queue1);


        System.out.println("-------------------------------ArrayDeque----------------------------");

        Queue<Integer> queue2 = new ArrayDeque<>();// insertion order // no null FIFO// no index no get()
        queue2.addAll(Arrays.asList(10,20,200,300,40,90));
        queue2.addAll(Arrays.asList(10,20,200,300,40,90));
        queue2.addAll(Arrays.asList(10,20,200,300,40,90));
        queue2.addAll(Arrays.asList(10,20,200,300,40,90));
       // queue2.addAll(Arrays.asList(null, null,null,null));
        System.out.println(queue2);

        queue2.poll();// calling poll() each time is removing one element
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();

        System.out.println(queue2);


        System.out.println("------------------------------LinkedList-Queue-------------------------");

        Queue<Integer> queue3= new LinkedList<>();// poll() insertion order// allow duplicate// accept null/ has index

        queue3.addAll(Arrays.asList(10,20,200,300,40,90));
        queue3.addAll(Arrays.asList(10,20,200,300,40,90));
        queue3.addAll(Arrays.asList(10,20,200,300,40,90));
        queue3.addAll(Arrays.asList(null, null,null,null));
        System.out.println(queue3);


        queue3.poll();
        System.out.println(queue3);

        System.out.println(((LinkedList)queue3).get(2) ); // CAST to get the get()


        System.out.println("-------------------------------------");
        List<Integer> list = new LinkedList<>();// List is implementing the queue interfaces poll() down cast to use

        list.addAll(Arrays.asList(10,20,200,300,40,90));
        System.out.println(list.get(3));
        System.out.println(list);

       // System.out.println(((Queue)list).poll());
        ((LinkedList )list).poll();
        System.out.println(list);

       // ((Stack )list).pop();//LIFO no casting must use constructor no has A relationship
        System.out.println(list);


    }
}


















