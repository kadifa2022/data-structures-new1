package com.cydeo.stack;

public class CallTest {

    public static void main(String[] args) {
        System.out.println(aA());

    }
    static String  aA(){
        System.out.println("Ahas started");
        bB();
        return "Completed";
    }
    static void   bB(){
        System.out.println("B is visited");
        cC();

    }
    static void cC(){
        System.out.println("C is visited");
    }
}
