package com.cydeo.queues.myQueue;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();


    void enqueue(int num){
        stack1.push(num);


    }


    int dequeue(){
        peek();

        return  stack2.pop();


    }
    int peek(){
        if(stack2.isEmpty())
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        return stack2.peek();

    }


    boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

}
