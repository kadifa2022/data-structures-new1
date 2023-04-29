package com.cydeo.day38_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {// not permanent solution

    public static void main(String[] args) throws InterruptedException {// if we will not call main methode anywhere the ideal solution is throws keyword


    method1();
    }

     public static void pauseFor5Seconds() throws InterruptedException {
        Thread.sleep(5000);

    }
    public static void method1() throws InterruptedException {// permanently is with dry and catch / temporary and faster is throws word
        System.out.println("Hello word");
        pauseFor5Seconds();
        System.out.println("Hello Cydeo");
    }

            // fests way to get rid of compile error is with the throws but the beast solution is with dry and catch
    public static void method2() throws InterruptedException, FileNotFoundException {
        System.out.println("First Program started");
        Thread.sleep(3000);
        System.out.println("First Program ended");
        new FileInputStream(" ");

        Thread.sleep(5000);
    }


}
