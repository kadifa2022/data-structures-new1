package com.cydeo.Practice.Arrays;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many elements? (max is 20)");
        int n = input.nextInt();

        while(n>20 || n<=0){
            System.out.println("Invalid number, try again: ");
            n = input.nextInt();
        }

        Point[] points = new Point[n];
        fillArrayOfPoint(points);
        printArrayOfPoint(points);
    }
    private static void printArrayOfPoint(Point[] points) {
        System.out.println("The elements are:");
        for (int i = 0; i < points.length ; i++) {
            System.out.println("(" + points[i].x + "," + points[i].y +")");
        }
        System.out.println(Arrays.toString(points));

    }
    private static void fillArrayOfPoint(Point[] points) {
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < points.length; i++) {
            System.out.println("Enter x and y for point" + (i + 1 )+  " : ");
            points[i] = new Point(input.nextInt(), input.nextInt());
        }


    }
}
