package CollectionsUtilityClass;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
   /*
        // disadvantage
    // using Collection(parent type)as reference type// can't use methods from the child type
    // based on polymorphism
        Collection<Integer> collection = new ArrayList<>();//list has get() uniq method that collection does not have
        collection.add(100);
        collection.add(100);
        collection.add(200);
        collection.add(300);
       // System.out.println(collection.get(0)); compile error
        System.out.println(collection);
*/

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        System.out.println(list.get(0));
        System.out.println(list);



        List<String> names = new ArrayList<>();
        names.add("James");
        names.add("Breanna");
        names.add("Bella");
        names.add("Daniel");
        names.add("Toto");
        names.add("James");
        names.add("James");
        names.add("James");
        System.out.println(names);
        /*
        for (int i =0; i< names.size() ;i++){
            System.out.println(names.get(i));
             }

         */
        for (String each :names) {
            System.out.println(each);

        }

        System.out.println("Set---avoid dup--------");
        // disadvantage // does not have index number to access the elements

        Set<String> employees = new HashSet<>();
        employees.add("James");
        employees.add("Joe");
        employees.add("Brianna");
        employees.add("Bela");
        employees.add("Daniel");
//        employees.add("James");
//        employees.add("James");

        System.out.println(employees);
       // System.out.println(employees.get(0));

        for (String each: employees) { // (can not get specific) one element in set no index
            System.out.println(each);
        }
        System.out.println(new ArrayList<>(employees).get(1)); // converting set to list by
                                                               // using constructor to get the index

        System.out.println("using Iterable method removeIf () with lambda expression" +
                "to remove elements from collection in efficient  way");


        List<String> words = new ArrayList<>();

        words.addAll(Arrays.asList("Java", "Java", "java", "python", "C#", "C++", "Ruby", "java", "jAVa", "Jamila"));
        words.removeIf(p-> p.toLowerCase().startsWith("j") && p.toLowerCase().endsWith("a"));
        System.out.println(words);

        System.out.println("ForEach() takes consumer for argument  ");
        // if we can't use loop we can still use forEach method to iterate collection

        words.forEach(c -> {// get each element except "python"
            if(!c.equals("python"))
            System.out.println(c);
        });







    }
}
