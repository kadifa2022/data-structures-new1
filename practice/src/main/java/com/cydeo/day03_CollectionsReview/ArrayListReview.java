package com.cydeo.day03_CollectionsReview;

import java.util.ArrayList;
import java.util.List;

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
    }
}
