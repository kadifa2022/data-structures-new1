package com.cydeo.day37_exceptions;

import java.util.ArrayList;

public class ErrorExample {

    public static void main(String[] args) {
        ArrayList<Pizza> pizzas = new ArrayList<>();
        while (true) {
            pizzas.add(new Pizza('S', 2, 3));
        }


    }

}
// out of memory error