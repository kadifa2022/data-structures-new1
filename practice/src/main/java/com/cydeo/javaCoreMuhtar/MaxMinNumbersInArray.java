package com.cydeo.javaCoreMuhtar;

public class MaxMinNumbersInArray {

    public static void main(String[] args) {
        int [] arr = {10,5,-4,20,15};

        // declare and find the max number
        int max = arr[0];// assuming that first number of array is max
        int min = arr [0];
        for (int each : arr) { //getting each element from given array
            if(each > max){// if this condition become true there is element grater than max
                max = each; // then will be to reAssign to max
                             // after loop is completed last max value will be assigned to max
            }

            if(each < min){
                min = each;
            }

        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);












    }
}

/*
Write a program that can identify the largest and smallest numbers present in a given array of integers
The solution should handle arrays of varying lengths and consider negative numbers if preset.

Ex: arr = {10,5,-4,20,15}

    Output: Maximum number is 20
    Minimum number is -4
 */