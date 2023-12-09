package com.cydeo.Practice.Arrays;

public class ForEach {

    public static void main(String[] args) {

        int[] arr={5,2,2,0};

        int i = 0; // variable for index created

        for ( int each: arr ) {
            System.out.println(each + " "  + i++);

        }
    }
}
