package com.cydeo.Practice;

public class PrintTwoDimensionalArray {
    public static void main(String[] args) {
        // printing 2 dimensional array row by row
        int [][] integers = { {3,5,7},{10,2,9}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(integers[i][j] + " ");

            }
            System.out.println(); // to print 2 rows

        }


    }
}
