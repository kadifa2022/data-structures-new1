package com.cydeo.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many elements? (max is 20)");
        int n = input.nextInt();

        while(n>20 || n<=0){
            System.out.println("Invalid number, try again: ");
            n = input.nextInt();
        }

        int [] numbers = new int[n];
        fillArrayOfIntegers(numbers);
        printArrayOfIntegers(numbers);

    }

    private static void printArrayOfIntegers(int[] numbers) {
        System.out.print("The elements are:");
        System.out.println(Arrays.toString(numbers));

    }

    private static void fillArrayOfIntegers(int[] numbers) {
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();


    }
}
