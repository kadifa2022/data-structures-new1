package com.cydeo.day40_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,6,6,8,1,2,34,4,4,4));
/*
        for (Integer each: list) {// we are getting ConcurrentModificationException
            if(each <5){
                list.remove(each);
            }

        }

        for (int i = 0; i < list.size(); i++) {// can't use Because the size is changing each Iteration
            if(list.get(i)<5){
                list.remove(i);
            }

        }

        System.out.println(list);
*/
// WITHOUT ITERABLE WE CAN'T REMOVE ANY OBJECT FROM COLLECTION

        //


        System.out.println("---------------------Iterable /iterator()/ with while loop most preferred---------------------------");

        List<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,6,6,8,1,2,34,4,4,4));

       Iterator<Integer> it = list2.iterator();// how to use Iterator manually
       while (it.hasNext()){
           Integer each = it.next();
           if(each<5){
               it.remove();
           }

       }

        System.out.println(list2);

        System.out.println("---------------------Iterable /iterator() with for loop ---------------------------");


        List<Integer> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,6,6,8,1,2,34,4,4,4));

        for (Iterator<Integer> i = list3.iterator(); i.hasNext(); ) {// we don't need ++ because it has fixed iteration
                     Integer each = i.next();
                     if(each< 5){
                         i.remove();
                     }
        }

        System.out.println(list3);


        System.out.println("-------------------------removeIf(), lambda -> instead of iterator--------");


        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,3,4,1,2,3,3));
        list4.removeIf(each-> each<5);// removeIF() Implicitly use iterator/ come with Java 8
        System.out.println(list4);


        System.out.println("-------------------------removeIf() with LinkedList--------------------");

        List<Integer> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,3,4,1,2,3,3));

        list5.removeIf(p-> p<5);
        System.out.println(list5);

        
        
        
        
        

    }
}
