package com.cydeo.day37_exceptions;

public class FinallyBlock {

    public static void main(String[] args) {
        try{
            System.out.println(9/0);
        }catch(RuntimeException e){// NullPointerException"Null Pointer exception has been caught"
            System.out.println("Runtime Exception has been caught");
            e.printStackTrace();
            System.exit(1);// terminate program
        }finally {// finally block will always execute / optional
            System.out.println("Finally block");
        }
    }
}
