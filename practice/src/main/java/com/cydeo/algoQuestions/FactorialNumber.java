package com.cydeo.algoQuestions;

public class FactorialNumber {

    public static void main(String[] args) {
        System.out.println(factorialNumber(5));

    }
    public static int factorialNumber(int num){
        int  result = 1;
        for (int i = 1; i <=num ; i++) {
            result = result*5;

        }
        return result;
    }

}
/*
    Write a return method that returns the factorial number of any given number
    Ex:
    Input: 5
    outPut: 120
    because 5 * 4 * 3 * 2 * 1 = 120
    */