package com.cydeo.array_InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class AddUpToSum {
    public static void main(String[] args) {

        int[]array = {8,6,7,4,3,2,1};
        int sum = 11;

        Map<Integer, Integer> pairs = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if(array[i] + array[j] ==sum){
                    pairs.put(array[i],array[j]);
                }

            }

        }
        System.out.println(pairs);
    }



}
 /*
    given an int[] 'arr' and another int 'sum',
    Write a function which can find a pair of ints in 'arr' that add up to 'sum'.
    Example:
    arr = [8, 7, 2, 5, 3, 1] sum = 10
    Output:
    {8=2, 7=3}
    */
