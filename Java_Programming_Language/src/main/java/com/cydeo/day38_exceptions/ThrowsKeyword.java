package com.cydeo.day38_exceptions;

import java.io.FileNotFoundException;

public class ThrowsKeyword {

    public static void main(String[] args) throws  InterruptedException, FileNotFoundException {// for checked exception and is shorter less code / clean and faster to fixed

        //throws keyword never use for handling  the unchecked exceptions (only way to handler Unchecked EXCEPTION is dry and catch)
        // throws keyword use for checked exceptions (and try and catch also)

  /*      System.out.println("Program1 started");

       //  System.out.println(100/0); unchecked exception
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){// we used 4 block of code disadvantage
            e.printStackTrace();
        }
        System.out.println("Program1 ended");

        System.out.println("----------------------------------------------------");

        System.out.println("program2 starts");
       // System.out.println(100/0);
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Program2 ended");
        */
        System.out.println("Program3 started");

        Thread.sleep(5000);// checked exception
        System.out.println("Program3 ended");


        System.out.println("-----------------------------");

        System.out.println("Program4 started");

        Thread.sleep(5000);//checked exception and we will add throws key word in methode signature
        System.out.println("Program4 ended");


        System.out.println("-----------------------------");
        System.out.println("Program5 started");
       // FileInputStream file = new FileInputStream("");//FileNotFoundException in method signature added
        Thread.sleep(5000);

        System.out.println("Program5 ended");



    }
}
