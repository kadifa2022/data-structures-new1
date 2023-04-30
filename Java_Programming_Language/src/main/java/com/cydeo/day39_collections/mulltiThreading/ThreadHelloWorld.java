package com.cydeo.day39_collections.mulltiThreading;

public class ThreadHelloWorld extends Thread{// extending Thread class


    @Override
    public void run() {//right click and override methode run() from Threat class
        for(int i = 1; i< 6; i++) {// we can create multi threads n java
            System.out.println("Hello world " + 1);
        }


    }
}
