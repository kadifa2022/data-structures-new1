package com.cydeo.day05_stack;

public class RecursionFibonacci {
    public static void main(String[] args) {


        System.out.println(fib(2));
        System.out.println(fib(11));
    }

    public static int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fib(n-1) +fib(n-2);
    }


    //fibonacci numbers are (1,1,2,3,5,8,13,21,34,55)

}
