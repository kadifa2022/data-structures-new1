package com.cydeo.day39_collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();// list accepts duplicates , keeps insertion order, has index
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(list);


        Set<Integer> set1 = new HashSet<>();// order is random, accepts null
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(null,null,null,null,null));
        System.out.println(set1);


        Set<Integer> set2 = new LinkedHashSet<>();// insertion order, accepts null
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(null,null,null,null,null));

        System.out.println(set2);


        Set<Integer> set3 = new TreeSet<>();// Keeps sorting order, does not accept null
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //set3.addAll(Arrays.asList(null,null,null,null,null));
        System.out.println(set3);


        System.out.println("--------------------------------------------");






        String[] words = {"Java", "Java", "Java", "Python", "Python", "C#", "C++", "Ruby", "C#"};
        LinkedHashSet<String> result = new LinkedHashSet<>();

        result.addAll(Arrays.asList(words));

        System.out.println(result);

        //System.out.println(result.get(1));//no index in set

        //for (String each:result) { // for each loop can be used to et each element
        //    System.out.println(each)
        System.out.println(new ArrayList<>(result).get(1));// hash set converted to array
        words =result.toArray(new String[0]);// toArray() is from collection and any type of collection can use


        System.out.println(new ArrayList<>(result).get(1));  // Set is converted to array list

        System.out.println("------------------------------------------------");
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 10, 10, 10, 10, 20, 20, 20, 20, 20, 30, 30, 30, 30, 30, 40, 40, 40, 50, 50));

        Set<Integer> n = new TreeSet<>(numbers);
        System.out.println(n);

//                                          // constructor that take one argument() in collection type
//        System.out.println(new TreeSet<>(numbers));// remove duplicate and same time sorting in order
//        }


    }
}