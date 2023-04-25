package com.cydeo.Day28_OOP_concepts.abstraction.employeeTask_Abstraction;

public class Teacher extends Employee{





    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {//abstract methode and giving body
        System.out.println(getName()+ "is teaching");

    }
}
