package com.cydeo.javaCoreMuhtar;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int [] arr = {10,5,30,15,0};

        // Write your code here
        int [] newArr = new int[arr.length ];

        for (int i = arr.length-1, j = 0 ; i>=0; i--, j++){
           newArr [j]= arr[i];
        }
        System.out.println(Arrays.toString(newArr));















    }
}
/*
Write a program that can  reverse a given array. It should accurately preserve the elements in order
and handle arrays of varying lengths
ex:
arr = {10,5,30,15,0}

output: {0,15,30,5,10}
 */