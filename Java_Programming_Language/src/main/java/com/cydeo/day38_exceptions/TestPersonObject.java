package com.cydeo.day38_exceptions;

import jdk.swing.interop.SwingInterOpUtils;

public class TestPersonObject {

    public static void main(String[] args) {


        Person person1 = new Person("Daniel", 32, 'M');
        System.out.println(person1);



            person1.setAge(-25);





        System.out.println(person1);
    }
}
