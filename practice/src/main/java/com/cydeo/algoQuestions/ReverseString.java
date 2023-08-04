package com.cydeo.algoQuestions;

public class ReverseString {
    public static void main(String[] args) {
        String str = "The sky is blue";

        String reverse = "";
        for(int i = str.length() -1; i >=0; i--){
            reverse += str.charAt(i);

        }
        System.out.println(reverse);
    }

}
/*

Write a program that can reverse a given String. The solution should accurately preserve the character order,
including whitespaces and special characters, while maintaining case sensitivity.

In addition, the solution should handle Strings of varying lengths.

Ex:
str = "Java Programming"

output:
"gnimmargorP avaJ"

 */