package com.cydeo.testProject;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestClass1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        List<Integer> collect =  numbers.stream().filter(n-> n % 2 ==0).collect(Collectors.toList());
        System.out.println(collect);

        // predicate
        Predicate<Integer> isEven = n->n%2 == 0;
        System.out.println( isEven.test(1));
    }
}
