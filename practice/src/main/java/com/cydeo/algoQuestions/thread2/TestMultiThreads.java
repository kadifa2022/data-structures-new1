package com.cydeo.algoQuestions.thread2;

public class TestMultiThreads {

    public static void main(String[] args) {

        ThreadHelloWord thread1 = new ThreadHelloWord(1);
        ThreadHelloWord thread2 = new ThreadHelloWord(2);
        ThreadHelloWord thread3 = new ThreadHelloWord(3);
        ThreadHelloWord thread4 = new ThreadHelloWord(4);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();




    }
}
