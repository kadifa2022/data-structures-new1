package com.cydeo.javaCoreMuhtar;

public class SwapTwoNumbers {


    public static void main(String[] args) {
        swap1(3, 5);

        swap2(5,6);
    }
    //solution 1
    public static void swap1(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    //solution 2

    public static void swap2(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
