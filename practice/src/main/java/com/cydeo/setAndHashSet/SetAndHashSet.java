package com.cydeo.setAndHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetAndHashSet {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Walter");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Saul");
       // names.add("Walter");no duplicates no particular order
        names.forEach(System.out::println);// lambda forEach method
        Iterator<String> namesIterator= names.iterator();
        while(namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }


//        for (String name: names){
//            System.out.println(name);
//        }




        //names.remove("Walter");
        // System.out.println(names.size());//method size()
        //System.out.println(names.contains("Saul")); //boolean
        System.out.println(names.isEmpty());
    }
}
