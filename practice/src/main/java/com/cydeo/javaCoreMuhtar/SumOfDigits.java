package com.cydeo.javaCoreMuhtar;

public class SumOfDigits {
    /*
    Write a function that can return the sum of digits of an integer Do not use any String manipulation
    ex:
    input : 123
    output : 6
     */

    public static int sumOfDigits(int number){
        int sum = 0;
        while (number > 0){
            sum +=(number % 10);
            number /=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1231));
        System.out.println(20 + 20);
    }

}
