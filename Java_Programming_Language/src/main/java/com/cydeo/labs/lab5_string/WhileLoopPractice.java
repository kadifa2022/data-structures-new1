package com.cydeo.labs.lab5_string;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Would you like to continue? yes/ no");
        String a = input.nextLine().toLowerCase();



        // of the condition is not repeating we can use if statement
        // both accept the conditions

        // if the condition is repeating we ere using while loop
        while(!(a.equals("yes") || a.equals("no"))){// we don't know how many times this statement will be repeated
            System.err.println("Invalid entry! Would you like to continue? yes/no");
            a = input.nextLine().toLowerCase();




        }
    }
}
