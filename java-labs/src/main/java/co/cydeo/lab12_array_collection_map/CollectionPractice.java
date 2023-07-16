package co.cydeo.lab12_array_collection_map;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();//array has get()// allows duplicates
        list.add(100);
        list.add(120);
        list.add(100);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(1000);

        System.out.println(list.get(4));
        System.out.println(list);

        System.out.println("--------------------");

        List<String> names = new ArrayList<>();

        names.add("James");
        names.add("Jana");
        names.add("Ajla");
        names.add("Sejla");
        names.add("James");
        names.add("Bilal");
        names.add("James");
        names.add("James");
        names.add("James");
        System.out.println(names);
        //can use regular for loop and forEach to iterate list
      /*  for (int i = 0; i <names.size() ; i++) {
            System.out.println(names.get(i));
          }

       */
        for (String each: names) {
            System.out.println(each);


        }

                

        System.out.println("----HashSet does not allow duplicates- no idex - forEach only -----");

        Set<String> employees = new HashSet<>();
       // employees.add("James");
        employees.add("Lidia");
        employees.add("Mumin");
        employees.add("Jack");
        employees.add("James");
        employees.add("James");

        for (String each : employees) {
            System.out.println(each);
        }
        // converting collection to another collection from SET to LIST by using constructor with argument
        // every collection has constructor
        //Disadvantage of collection by using loops, is removing the elements, everytime one element is removed elements are shifting
        // Iterable we are use from removing element/objects  from collection  ( removeIf () from collection
        System.out.println(new ArrayList<>(employees).get(3));

        System.out.println(employees);


        System.out.println("--------------Iterable removeIf() ----removing object from collection");

        List<String > words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java","Java" , "Ruby", "C++", "C#"));
        // predicate return boolean ->
        //words.removeIf(p->p.equalsIgnoreCase("Java"));
        //removeIf()-> use lambda
        words.removeIf(p->p.toLowerCase().startsWith("j") && p.toLowerCase().endsWith("a"));
        System.out.println(words);

        // forEach()takes consumer functional Interface and returning nothing
        //we use lambda expression just for overriding abstract method
        words.forEach(c->{
            if(!c.equals("Java")) {
                System.out.println(c);

            }
        });

























    }
}
