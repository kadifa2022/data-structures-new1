package com.cydeo.algoQuestions;

public class MultiplyElements {


    static int[] multiplyElements(int[] ints){
        if(ints == null) return null;
        int n = ints.length;
        if( n == 1 )return ints;
        int[] result = new int[n];
        result[0] = ints[0] * ints[1];
        result[n-1] = ints[n-2] * ints[n-1];

        for (int i = 1; i < n-1; i++) {
            result[i] = ints[i - 1]* ints[i + 1];

        }

        return result;

    }




}
/*
Given an array of integers, update every element with the multiplication of previous and next elements with the
following exceptions.
a) The First element is replaced the by multiplication the of first and second.
b) The last element is replaced by multiplication of the last and second last.

Input : arr[] = {2, 3, 4, 5, 6}
Output : arr[] = {6, 8, 15, 24, 30}

 */