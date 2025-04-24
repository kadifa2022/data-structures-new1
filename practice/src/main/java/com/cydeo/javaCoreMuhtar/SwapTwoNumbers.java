package com.cydeo.javaCoreMuhtar;

public class SwapTwoNumbers {


    public static void main(String[] args) {
        swap1(3, 5);

        swap2(5,6);

        swap3(10,3);
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
    public static void swap3(int num1, int num2){//10 3

        int temp = num1;// num1 10 to temp
        num1=num2;//num2(3) to num1
        num2=temp;//temp 10 to num2
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
    }

}
