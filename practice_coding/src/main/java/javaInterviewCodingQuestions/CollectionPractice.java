package javaInterviewCodingQuestions;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(300);
        list.add(300);
        list.add(400);
        System.out.println(list.get(0));
        System.out.println(list);
        System.out.println("--accept duplicates and has index ----------------");

        List<String> names = new ArrayList<>();
        names.add("James");
        names.add("Breanna");
        names.add("Bella");
        names.add("James");
        names.add("James");
        names.add("James");
        System.out.println(names.get(1));
        // can be used or loop, and for each loop
        /*
        for (int i = 0; i <names.size() ; i++) {
            System.out.println(names.get(i));
 }
     */
        for (String each: names) {
            System.out.println(each);

        }

        System.out.println("set does not accept duplicates, does not have index, ");

        Set<String>employees = new HashSet<>();
        employees.add("James");
        employees.add("Breanna");
        employees.add("Bella");
        employees.add("Daniels");
//        employees.add("James");
//        employees.add("James");
//        employees.add("James");

        System.out.println(employees);
        //System.out.println(employees.get(0));

        for(String each: employees){
            System.out.println(each);
        }
        System.out.println(new ArrayList<>(employees).get(1));

        System.out.println(" removeIf() directly from iterable----------");

        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "java ","Jamila", "Python", "C#", "Ruby","java","JaVa"));
        words.removeIf(p -> p.toLowerCase().startsWith("j") && p.toLowerCase().endsWith("a"));
        System.out.println(words);

        System.out.println("forEch()  is taking consumer , no return type and accept( one parameter)  ");

        words.forEach(c-> {
                if(!c.equals("Python"))      // print all except  "Python"
                System.out.println(c);
        });
    }
}
