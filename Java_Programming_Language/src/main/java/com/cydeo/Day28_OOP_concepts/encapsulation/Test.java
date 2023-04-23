package com.cydeo.Day28_OOP_concepts.encapsulation;

public class Test {

    public static void main(String[] args) {
        Student student = new Student();
        // student.age =-200; //invalid data // no control over data without private access modifier

        student.setAge(25);
        System.out.println(student.getAge());
        System.out.println("Test completed");
       // student.name = "Aaron";
       // student.setName("Aaron123");//has digit -invalid name
        student.setName("Aaron");
        System.out.println(student.getName());




    }
}
