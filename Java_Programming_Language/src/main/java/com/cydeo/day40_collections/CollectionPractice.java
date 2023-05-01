package com.cydeo.day40_collections;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
        // list can be reference type to any class of list
        //List<Integer> list = new ArrayList<>();

        Collection<Integer> collection = new ArrayList<>();
        collection.add(100);
        collection.addAll(Arrays.asList(100,200,300,400,500,600,700));

        System.out.println(collection);
        // up casting - casting the sub-type to super type
        // down casting - casting Super type to sub-type
        System.out.println(((ArrayList<Integer>) collection).get(2));// cast to array list
       // System.out.println(((Stack)collection).pop());//no relationship can't be casted

        System.out.println("--------------------------------------");

        Collection<Integer> collection2 = new HashSet<>();
        collection2.addAll(Arrays.asList(100,200,300,100,100,2000,500,300,400,700,900));
        System.out.println(collection2);

       // System.out.println(((ArrayList)collection2).get(3));// classCastException we can't cast if no relationship

        // for converting one collection type to another we have to use  constructor(parameter) if is NO A relationship

        System.out.println(new ArrayList<>(collection2));// just for one use/pass argument collection
        // for reuse ArrayList we need to assign to reference variable
        List<Integer> list = new ArrayList<>(collection2);

    }
}
