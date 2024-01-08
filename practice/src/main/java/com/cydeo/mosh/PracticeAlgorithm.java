package com.cydeo.mosh;

import java.util.Arrays;

public class PracticeAlgorithm {

    public static void main(String[] args) {
        int[] numbers = {10,20,30};
        System.out.println(numbers.length); // the size of the array 3 items
        System.out.println(Arrays.toString(numbers)); // prints array


    }





    public void log(int [] numbers){// single operation in constant time
        // (complexity O(1))
        System.out.println(numbers [0]);
    }
}
