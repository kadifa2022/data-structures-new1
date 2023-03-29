package com.cydeo.setAndHashSet;

import java.util.*;

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

        List<Integer> numberList= new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(1);
        numberList.add(3);
        numberList.add(2);
        numberList.add(3);
        System.out.println(numberList);
        //set will take always same amount of time no mather how many elements
       Set<Integer> numberSet= new HashSet<>(numberList); // added list and is using hashTable behind scene
       numberSet.addAll(numberList);//list added-second way
        System.out.println(numberSet);

        Set<String> nameSet1= new TreeSet<>();//
        nameSet1.add("Walter");
        nameSet1.add("Violetta");
        nameSet1.add("Ibrahim");
        nameSet1.add("Musa");
        nameSet1.add("Muhamed");
        //nameSet1.add("Muhamed"); no dup /ascending order

        System.out.println(nameSet1);

        Set<String> names1 = new LinkedHashSet<>();//no dup /inserting order/almost fast as hashSet
        names1.add("Walter");
        names1.add("Violetta");
        names1.add("Ibrahim");
        names1.add("Musa");
        names1.add("Muhamed");
        System.out.println(names1);





//        for (String name: names){
//            System.out.println(name);
//        }




        //names.remove("Walter");
        // System.out.println(names.size());//method size()
        //System.out.println(names.contains("Saul")); //boolean
        System.out.println(names.isEmpty());
    }
}
