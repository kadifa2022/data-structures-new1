package com.cydeo.collection_queues;

import java.util.Stack;

public class ReverseFirstKElementsQueueProblem {
    public static void main(String[] args) {//o(n)
      MyQueue<Integer> queue=new MyQueue<>();
        for (int i = 1; i < 6; i++) {
            queue.enqueue(i);
        }
        System.out.println("Initial queue: ");
        queue.printQueue();
        System.out.println();
        System.out.println("After reverse");
        reverseFirstK(queue,3).printQueue();
    }
        static MyQueue<Integer> reverseFirstK(MyQueue<Integer> queue, int k){ //space complexity o(n) because of stackK
        // create stack
            Stack<Integer> stack =new Stack<>();
            //push first K elements into stack
            for (int i = 0; i < k; i++) {
                stack.push(queue.dequeue());//push to queue
            }
            //enqueue elements back into the queue
            while(!stack.isEmpty()){
                queue.enqueue(stack.pop());
            }
            //dequeue and enqueue size of queue n-k times
            for (int i = 0; i < queue.size-k; i++) {
                queue.enqueue(queue.dequeue());

            }
            return queue;
        }

        static MyQueue<Integer> reverseFirstK2(MyQueue<Integer> queue, int k){ // o(n) because of stack
        //create stack
             Stack <Integer> stack = new Stack<>();
            for (int i = 0; i < k; i++) {
                stack.push(queue.dequeue());// push to queue

            }
            while (!stack.isEmpty()){
                queue.enqueue(stack.pop());
            }
            for (int i = 0; i < queue.size-k; i++) {
                queue.enqueue(queue.dequeue());

            }
            return queue;

        }






    }

