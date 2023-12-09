package com.cydeo.Practice;

public class SumOfTwoDimensionalArray {

    public static void main(String[] args) {

        // sum of the row
        //sum of the colum
        int[][] integers = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int sum = 0;
        for (int i = 0; i < 4; i++) {
          sum = 0;
            for (int j = 0; j < 3; j++)
               sum += integers[j][i];

       System.out.println("The sum of column " + (i + 1)+  ": " + sum );


        }
    }
}
