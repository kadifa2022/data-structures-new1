package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        System.out.println("top25 java 8 coding interview questions and answers");
        List<Integer> nums = Arrays.asList(10,12,22,5,100,13);

        System.out.println("1) Given the list of integer , find the first element of the list using stream");
        nums.stream().findFirst().ifPresent(System.out::println);

        System.out.println("2) Given list of integers, find the total number of elements present in the list using stream functions?");
        System.out.println(nums.stream().count());

        System.out.println("3) Given a list of integers, find all even and odd number of elements present in the list using Stream function");
       nums.stream().filter(num -> num%2 == 0).forEach(System.out::println);
       nums.stream().filter(num -> num%2 != 0).forEach(System.out::println);

        System.out.println("Write a Java 8 program to sort an array and the convert the sorted array into stream");
        int [] numbers = {1,2,4,5,3,1};
        Arrays.sort(numbers);
    }
}
