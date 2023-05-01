package com.cydeo.day39_collections.mulltiThreading;

public class ThreadHelloWorld extends Thread{// extending Thread class

    int threadNumber;// created instances to see order of threat

    public ThreadHelloWorld(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    //thread created in run()
    @Override
    public void run() {//right click and override methode run() from Threat class
        for(int i = 1; i< 6; i++) {// we can create multi threads n java
            System.out.println("Hello world " + i+ " from Thread " + threadNumber);// iteration
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }


    }
}
