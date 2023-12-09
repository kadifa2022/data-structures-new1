package com.cydeo.Practice;

import java.util.Arrays;

public class MovingOddAndEvenNumbersInArray {
    public static void main(String[] args) {
        int [] numbers = {1,2,4,5,7,9,-2,3};

        int [] temp = new int[numbers.length];
        int j = 0;
        int k = numbers.length -1;

        for(int i = 0; i <numbers.length; i++)

            if(numbers[i] %2 !=0)
                temp[j++] = numbers[i];
            else
                temp[k--] = numbers[i];
            copyArray(temp, numbers);

        System.out.println(Arrays.toString(numbers));
        }

    private static void copyArray(int[] temp, int[] numbers) {
        for(int i =0; i< temp.length; i++)
            numbers[i] = temp[i];

    }
}

