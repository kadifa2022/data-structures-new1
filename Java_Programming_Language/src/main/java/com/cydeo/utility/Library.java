package com.cydeo.utility;

public class Library {// customize sleep method

    public static void sleep(double seconds) {//shorter / clean/ readable

     try {
         Thread.sleep((long) (seconds * 1000L));
     }catch(InterruptedException e){
         throw new RuntimeException(e);
     }

    }

}
