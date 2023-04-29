package com.cydeo.day37_exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {


        System.out.println("Program1 started");
        try {

            System.out.println(9 / 0);//Arithmetic Exception

            System.out.println("Try block");

        }catch(ArithmeticException e){//must give right class to handle exception

            System.out.println("Catch block");// will handler only if they have is A relationship
        }
        System.out.println("Program1 ended");

        System.out.println(" -------------------------------------------");
        System.out.println("Program2 started");


        String str = null;
        try {

            System.out.println(str.toLowerCase());
            System.out.println("Try b lock");
        }catch (RuntimeException e){ // can be used Throwable/ Exception (is for unchecked and checked) but is not wise to used it
            System.out.println("Catch block");// RuntimeException is dedicated for unchecked exception and will be able to handle any unchecked exception
        }
        System.out.println("Program2 ended");

        System.out.println("-------------------------------------------");

        System.out.println("Program3 started");
        try {
            Thread.sleep(3000);// checked exception
            System.out.println("Try block");
        }catch(InterruptedException e){
            System.out.println("Catch block");
        }
        System.out.println("Program3 ended");

    }
}
