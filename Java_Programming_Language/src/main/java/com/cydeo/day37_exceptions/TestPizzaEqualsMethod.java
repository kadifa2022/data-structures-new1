package com.cydeo.day37_exceptions;

import jdk.swing.interop.SwingInterOpUtils;

public class TestPizzaEqualsMethod {
    public static void main(String[] args) {


        Pizza pizza1 = new Pizza('S',2,3);
        Pizza pizza2 = new Pizza('S',2,3);

        System.out.println(pizza1==pizza2);//
        System.out.println(pizza1.equals(pizza2));// compare
    }
}
