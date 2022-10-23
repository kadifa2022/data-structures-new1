package com.cydeo.day03_CollectionsReview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListReview {
    public static void main(String[] args) {
        //create ArrayList and a class

        List<Student> students= new ArrayList<>();

        //add elements to ArrayList

        students.add(new Student(1,"Jack"));
        students.add(new Student(2,"Julia" ));
        students.add(new Student(3,"Mike"));
        students.add(new Student(4,"Mary"));

        //Iteration on ArrayLists
        //1. for loop with get index
        System.out.println("printing with legacy for-loop....................");
        for (int i = 0; i <students.size() ; i++) {
            System.out.println(students.get(i));

        }

        //2. Iterator
        //Forward Iteration
        System.out.println("Print with Iterator................................");
        Iterator iter=students.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        //Backwards Iteration
        System.out.println("Printing backwards with iterator....................");
        while(((ListIterator<Student>)iter).hasPrevious()){
            System.out.println(((ListIterator<Student>)iter).hasPrevious());
        }

    }
}
