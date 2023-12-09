package com.cydeo.Practice;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        String myName = "Programmer";
        System.out.println(myName);


    // constant can not be changed
        final String COMPANY_NAME;
        COMPANY_NAME = "Apple";
       // COMPANY_NAME = "Another name";
        System.out.println(COMPANY_NAME);
        System.out.println(COMPANY_NAME);
        System.out.println(COMPANY_NAME);
        System.out.println(COMPANY_NAME);
        System.out.println(COMPANY_NAME);


        byte b1= 5; //-128, 127
        short s1 = 20;
        int i1 = 100;
        long l1 = 999L;
        System.out.println(b1 - i1);
        System.out.println(s1 - b1);
        System.out.println(i1 - l1);
        l1 = i1;
        System.out.println(i1);
        System.out.println(l1);

        String str = "Cydeo";
        // toUpperCase(), toLoverCase()
        System.out.println(str.toUpperCase());
        String str2 = str.toLowerCase();
        System.out.println(str2);

        //s2.length()
        System.out.println(str2.length());
        int i2 = str2.length();
        System.out.println(i2);
        System.out.println(str2.concat(" Student"));

        System.out.println();
        int x = 10;
        int y = 20;


        if(x > y)
            System.out.println("the maximum is " + x);
        if(y > x )
            System.out.println("the maximum is " + y);
        if (x == y)
            System.out.println(" the numbers are equal");


        System.out.println("enter an integer");

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if (num % 2 == 0 )
            System.out.println("Even Number");
        if(!(num % 2 == 0))
            System.out.println(" Odd Number");


        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1;  j<=10; j++) {
                System.out.print((i*j) + "");

            System.out.println();

            }
        }

        for (int i = 100; i >=1; i--) {
            if (i%2 !=0)
                System.out.print(i + " ");

        }





    }
}
