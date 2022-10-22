package com.cydeo.day05_stack;

import java.util.ArrayList;
import java.util.Stack;

public class SunsetViewEast {
    public static void main(String[] args) {
        int []buildings={3,5,4,4,3,1,3,2};
        sunsetViews(buildings, "East").forEach(System.out::println);
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction){
        Stack<Integer> stack =new Stack<>();
        for (int i = 0; i < buildings.length; i++) {
            while(!stack.isEmpty() && buildings[i]>=buildings[stack.peek()]){
                stack.pop();
            }
            stack.push(i);

        }
        return new ArrayList<Integer>(stack);
    }


}
