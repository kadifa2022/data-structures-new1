package com.cydeo.labs.lab5_string;

import java.util.Scanner;

public class PrintEach_loop {

    public static void main(String[] args) {

        String word = new Scanner(System.in).nextLine(); // to
/*
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);

 */

        for(int i = 0; i <= word.length()-1; i++){
             char each =word.charAt(i);//  to get all characters
            System.out.println(each);

        }

    }

}
