package com.cydeo.Day28_OOP_concepts.inheritance_Intro.typesOfInheritance;

import java.time.LocalDate;


public class Teacher extends Employee{

    public Teacher(String name, char gender, LocalDate DOB, String employeeId, String jobTitle, double salary) {
        super(name, gender, DOB, employeeId, jobTitle, salary);
    }

    public void  teach(){
        System.out.println(getName() + " is teaching");

    }
}
