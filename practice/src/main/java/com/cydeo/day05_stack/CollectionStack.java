package com.cydeo.day05_stack;

import java.util.Deque;
import java.util.LinkedList;

public class CollectionStack {

    public static void main(String[] args) {
        Deque<Integer> cStack=new LinkedList<>();

        cStack.push(1);
        cStack.push(2);
        cStack.push(3);
        cStack.push(4);
        System.out.println(cStack.peek());
        System.out.println(cStack.poll());
        System.out.println("peek is:" + cStack.peek());
    }
}
