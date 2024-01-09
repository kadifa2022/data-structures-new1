package com.cydeo.mosh;

import java.util.Arrays;

public class PracticeAlgorithm2 {

    public static void main(String[] args) {


                int[] numbers = new int[3];
                numbers[0] = 10;
                numbers[1] = 20;
                numbers[2] = 30;
                System.out.println(Arrays.toString(numbers));

            }



            public void log(int[] numbers) {// single operation in constant time
                // (complexity O(1))
                System.out.println(numbers[0]);
            }
}