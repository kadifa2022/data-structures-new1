package com.cydeo.day05_stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SunsetViews2 {
    public static void main(String[] args) {
        int[] buildings={3,5,4,4,3,1,3,2};
                sunsetViews(buildings, "West").forEach(System.out::println);
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction){

        //first we need stack
        Stack<Integer> stack =new Stack<>();

   int i=0;
    int step=1;

     //   for (int j = 0; j < buildings.length-1; j++) {

     //   }
       // this part is for West
        if(direction.equalsIgnoreCase("West")) {
            i = buildings.length - 1;
          step = -1;
     }
     while(i>=0 && i< buildings.length){

            while(!stack.isEmpty() && buildings[i]>=buildings[stack.peek()]){
                stack.pop();
            }

        stack.push(i);
        i+=step;
            //now i have stock with buildings index that can see sunset
         if(direction.equalsIgnoreCase("West")) Collections.reverse(stack);

   }

        return new ArrayList<Integer>(stack);
    }
}
