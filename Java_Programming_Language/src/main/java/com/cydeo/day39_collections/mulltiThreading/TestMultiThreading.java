package com.cydeo.day39_collections.mulltiThreading;

public class TestMultiThreading {

    public static void main(String[] args) {

        Thread thread1 = new ThreadHelloWorld(1); // Polymorphism reference type creating object from child class
        Thread thread2 = new ThreadHelloWorld(2);
        Thread thread3 = new ThreadHelloWorld(3);
        Thread thread4 = new ThreadHelloWorld(4);
        Thread thread5 = new ThreadHelloWorld(5);
        // we  call start() to execute all threats at the same time
        thread1.start();//multi threads are created and will be printed at the same time
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


    }
}
