package com.cydeo.algoQuestions.threadHelloWord;

public class ThreadHelloWord extends Thread {
    int threadNumber;

    public ThreadHelloWord(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello word " + i + "From Thread " + threadNumber);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}