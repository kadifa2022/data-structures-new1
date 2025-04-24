package com.cydeo.javaCoreMuhtar;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Java Programming";
        //write your code here

        //first thing we are declaring reversed string and assigning empty string to store reversed version of string
        String reversedStr = "";

        //second get each element from string(for loop) and concat
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        System.out.println(reversedStr);


        String str1 = "Java programing language";

        String reverseString = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            reverseString += str1.charAt(i);
        }
        System.out.println(reverseString);

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