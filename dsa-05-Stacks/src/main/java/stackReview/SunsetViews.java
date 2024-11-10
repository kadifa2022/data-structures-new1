package stackReview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SunsetViews {
    public static void main(String[] args) {
        int[] buildings = {3,5,4,4,3,1,3,2};
        System.out.println(sunsetViews(buildings, "east"));

    }
    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction){
        Stack<Integer> stack = new Stack<>(); // stack to hold the buildings indices that can see sunset
        // this part id for East by default
        int i=0;
        int step = 1;
        //this part is for west
        if(direction.equalsIgnoreCase("west")){
            i= buildings.length-1;
            step =-1;
        }
        // iterating through the buildings
        while(i>=0 && i<buildings.length){
            // remove buildings from stack that are shorter than the current one
            while(!stack.isEmpty() && buildings[i]>= buildings[stack.peek()]){
                stack.pop();
            }// add the current building index to the stack
            stack.push(i);
            i+=step; // move in the specific direction
        }
        // now i have a stack with the building indices that can see sunset
        if(direction.equalsIgnoreCase("west")) {
            Collections.reverse(stack);
        }

        return new ArrayList<>(stack);// convert the stack to an arrayList  and return
    }
}
