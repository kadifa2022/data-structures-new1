package com.cydeo.labs.lab5_string;

import java.util.Scanner;

public class CombineTwoWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word");
        String firstWord = scan.next();
        System.out.println("Enter your second word");
        String secondWord = scan.next();
        scan.close();
        String result = "";

        if(firstWord.charAt(firstWord.length() -1)==secondWord.charAt(0)){
            result = firstWord + secondWord.substring(1);

        }else{
            result = firstWord + secondWord;
        }
        System.out.println(result);
    }
}
