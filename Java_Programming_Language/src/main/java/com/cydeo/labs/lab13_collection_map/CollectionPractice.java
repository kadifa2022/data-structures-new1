package com.cydeo.labs.lab13_collection_map;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {
        // get() method can't be called from collection as reference type  //for ArrayList for reference type we need to use
        //ArrayList or List as reference type
        List<Integer> list = new ArrayList<>();// for reference type don't use collection with ArrayList
        list.add(100);
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);


        System.out.println(list.get(0));
        System.out.println(list);

        System.out.println("---------------------------------------------------------");

        List<String> names= new ArrayList<>();
        names.add("James");
        names.add("Breanna");
        names.add("Daniel");
        names.add("Mustafa");
        names.add("Violeta");
        names.add("James");
        names.add("James");

        System.out.println(names);
        
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(3));
//
//        }

        for (String each:names) {
            System.out.println(each);
            
        }

        Set<String> employees = new HashSet<>(); // avoiding  duplicates no index //forEach loop hashSet
        employees.add("James");
        employees.add("Mustafa");
        employees.add("Muhamed");
        employees.add("Jusuf");
        employees.add("Daniel");
        employees.add("James");
        employees.add("James");
        employees.add("James");
        employees.add("James");
        System.out.println(employees);





    }
}
