package com.cydeo.algoQuestions;

public class FindMaxNumber {

    /*
    Write a function that can find the maximum number from an int array
     */

    public static int maxValue(int[] n) {
        int max = Integer.MIN_VALUE;
        for (int each : n) {
            if(each>max){
                max = each;
            }

        }
        return max;
    }
}