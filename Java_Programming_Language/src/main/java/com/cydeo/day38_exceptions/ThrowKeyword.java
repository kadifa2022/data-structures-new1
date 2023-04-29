package com.cydeo.day38_exceptions;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
//throws is fixing temporally exception
// throw is throwing exception (creating exception)
public class ThrowKeyword {// the only purpose to use Throw keyword is to crash the programs

    public static void main(String[] args) {
        System.out.println("Enter your age");
        int age = new Scanner(System.in).nextInt();

        if (age < 0 || age > 150) {
            if (age < 0) {//throw key word is throwing exception
                throw new InputMismatchException("Age of the person should be negative " + age);

                // System.err.println("Invalid age");
                // System.exit(1);// instead of using exit () we can use throw keyword will tell us witch  line of the code will be execute

            } else {
                throw new InputMismatchException("Age of the person can not be greater than 150 : " + age);
            }
        }

        if (age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

        System.out.println("Runtime exception");


//        throw new RuntimeException("Runtime exception");
//        System.out.println("Hallo word");
        try {
            throw new FileNotFoundException(" ");

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}