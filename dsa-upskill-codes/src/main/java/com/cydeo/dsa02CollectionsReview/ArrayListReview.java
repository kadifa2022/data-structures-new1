package com.cydeo.dsa02CollectionsReview;

import java.util.*;

public class ArrayListReview {

    public static void main(String[] args) {
        //Create ArrayList and a class
        List<Student> students = new ArrayList<>();

        //add elements to ArrayList

        students.add(new Student(1, "Jack"));
        students.add(new Student(2, "Julia"));
        students.add(new Student(3, "Mike"));
        students.add(new Student(4, "Mary"));

        //Iteration on ArrayList
        //1. for loop with get(index)

        System.out.println("Printing with legacy for loop");

        for (int i = 0; i <students.size() ; i++) {
            System.out.println(students.get(i));

        }
        //2. Iterator
        //Forward Iteration
        System.out.println("Printing with iterator----------------");
        Iterator iter = students.listIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        //Backwards Iterator
        System.out.println("Printing Backwards with iterator-----------------");
              // Iterator is functional interface
        while(((ListIterator<?>) iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).previous());
        }

        //3. for each loop
        // class type - name for each student object : location of the students are ArrayList
        for(Student student: students){
            System.out.println(student);// printing each student
        }
        //4. Lambda
        System.out.println("printing with lambda function------------------------");
        students.forEach(student -> System.out.println(student));

        // Sorting elements in list using comparator interface
        System.out.println("Sorting with comparator Interface by id Desc");
        Collections.sort(students, new sortByIdDesc());
        System.out.println(students);

        System.out.println("Sorting with comparator Interface by Name Desc");
        Collections.sort(students, new sortByNameDesc());
        System.out.println(students);

        }


        // implementation of  comparator
        static class sortByIdDesc implements Comparator<Student>{

            @Override
            public int compare(Student o1, Student o2) {
                return o2.id-o1.id;
            }
        }
        static class sortByNameDesc implements Comparator<Student> {

            @Override
            public int compare(Student o1, Student o2) {
                return o2.name.compareToIgnoreCase(o1.name);
            }


        }

    }

