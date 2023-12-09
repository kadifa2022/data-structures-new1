package com.cydeo.Practice;

public class FindTheMaxNumberInEachRowTwoDimensionalArray {
    public static void main(String[] args) {

        int [][] integers = {
                {1,10,3,8},
                {9,12,6,7,},
                {5,2,11,4}};

        for(int i =0; i < 3; i++){
           // declare variable max  and initialize to be first element of the current row
            int max = integers[i][0]; // first element of the current row is the max element
           // we want to compare these elements with the rest of elements
            for (int j = 1; j < 4; j++) { // we are starting from 1, because we suppose that first element is the max
               //ternary operator: if the current element which is sub i, sub j is grater than max,
                // that means we have new max ? so the max will be equal sub i ,sub j if is not true max stay as it is
                max = (integers[i][j]> max) ? integers[i][j]:max;
            }

            System.out.println("Row " + (i + 1) + ": " + max);
        }
    }


}
