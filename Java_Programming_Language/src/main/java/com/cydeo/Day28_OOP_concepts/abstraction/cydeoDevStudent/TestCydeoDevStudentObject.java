package com.cydeo.Day28_OOP_concepts.abstraction.cydeoDevStudent;

import java.time.LocalDate;

public class TestCydeoDevStudentObject {


    public static void main(String[] args) {
        CydeoDevStudent student1= new CydeoDevStudent("Daniel", 'M', LocalDate.of(1980, 1,3), "A1", " ", 2);
        System.out.println(student1);
        student1.eat();
        student1.drink();
        student1.sleep();
        student1.breath();
    }
}
