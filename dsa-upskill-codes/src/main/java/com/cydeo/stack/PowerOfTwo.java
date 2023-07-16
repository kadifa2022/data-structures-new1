package com.cydeo.stack;

public class  PowerOfTwo {
    public  static boolean isPowerOfTwo(int n){

        //1. base condition if i have n
        if(n==1)return true;
        if(n%2!=0 || n<=0)return false;

        return isPowerOfTwo(n/2);
    }


/*
power of 2
int n = 16;
 is power 2
16/8 = 2
8/4 = 2
4/2 =2
2/1 = 1

recursion after calling new method, storing in system stack


 */
}
