package com.cydeo.day05_stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ElementsGreaterThanRight {
    public static void main(String[] args) {

    }

    public static List<Integer> find(Integer[] arr) {

        //condition if arr=null && arr.length==0;


        if (arr == null && arr.length == 0) {
            return new ArrayList<>();
        }
            //create stack
            Stack<Integer> stack = new Stack<>();
            //iterate the array

            for (int value:arr){
                while(!stack.isEmpty() && stack.peek()<value){
                    stack.pop();
                }
                stack.push(value);
            }

    return new ArrayList<Integer>(stack);

    }
}
/*
Given an unsorted integer array, print all greater elements than all elements present to their right using Stack.
• For example, consider the array [10, 4, 6, 3, 5]. The elements that are greater than all elements to their right are 10, 6,
and 5.
• 10>4&10>6&10>3&10>5


 */