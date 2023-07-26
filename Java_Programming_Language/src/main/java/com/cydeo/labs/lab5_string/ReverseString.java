package com.cydeo.labs.lab5_string;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Java Programming language";

        String reversedStr = "";

        for (int i = str.length() -1; i >= 0 ; i--) {
            reversedStr += str.charAt(i);

        }
        System.out.println(reversedStr);
    }

}
/*
Write a program that can reversed given string. The solution should accurately preserve the character order,
including white spaces and special characters, while maintaining case sensitivity.
In addition, the solution should handle Strings of varying lengths.

Exp:
str = "Java Programming language;

output:"egaugnal gnimmargorP avaJ"
 */