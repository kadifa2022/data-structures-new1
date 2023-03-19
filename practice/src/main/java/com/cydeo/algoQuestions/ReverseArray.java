package com.cydeo.algoQuestions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

//        int[] num = new int[5];
//        num[0] = 1;
//        num[1] = 2;
//        num[2] = 3;
//        num[3] = 4;
//        num[4] = 5;

        int[]num = {1,2,3,4,5};

        int[] reverse = new int[num.length];
        for (int i = 0, j = num.length - 1; i < num.length; i++, j--) {
            reverse[i] = num[j];
        }
        System.out.println(Arrays.toString(reverse));
    }
}

/*
Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};


 */