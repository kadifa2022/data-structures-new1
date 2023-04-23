package com.cydeo.Day28_OOP_concepts.encapsulation;

public class TestEmployeeObject {
    public static void main(String[] args) {



        Employee employee1 = new Employee();
        // employee1.salary = -20000;

        employee1.setSalary(100000);
        System.out.println(employee1.getSalary());
        employee1.setName("   "); //will be error message
        System.out.println(employee1.getName());
    }
}