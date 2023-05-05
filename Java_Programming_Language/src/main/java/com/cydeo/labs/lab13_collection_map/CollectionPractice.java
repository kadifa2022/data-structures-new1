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
//        employees.add("James");
//        employees.add("James");
//        employees.add("James");
//        employees.add("James");
        System.out.println(employees);

       // System.out.println(employees.get(0)); cat use get() no index number

        for (String each : employees) {
            System.out.println(each);}

            // we can convert collection to another collection through constructor
            System.out.println(new ArrayList<>(employees).get(1));// Set(employee) converted to ArrayList


        System.out.println("-------------Iterable -removeIf() -----------------------");// removeIf () using if we have condition like(remove all words that start with "J")

        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList(
                "Java", "Java", "JAVA", "Python", "C#", "C++","Ruby","Jva", "Jamila"));
        words.removeIf(p->p.toLowerCase().startsWith("j") && p.toLowerCase().endsWith("a"));
        System.out.println(words);
        // all collection has forEach() and takes consumer takes ona argument ad don't return any value
        // we use lambda expression just for overriding abstract method of functional interface
        words.forEach(c->{//forEach() added with Java 8
            if(!c.equals("Python"))
            System.out.println(c);
        });












    }
}
