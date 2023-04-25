package com.cydeo.Day28_OOP_concepts.inheritance.personTask_finalKeyword;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person person = new Person("Daniel", 'M', LocalDate.of(1991, 1, 25));
        System.out.println(person);
        person.breath();

        System.out.println("-------------------------------------------");

        Employee employee = new Employee("Emily", 'F', LocalDate.of(1994, 2,3), "Accountant", 40000);
        System.out.println(employee);
        employee.breath();

    }
}