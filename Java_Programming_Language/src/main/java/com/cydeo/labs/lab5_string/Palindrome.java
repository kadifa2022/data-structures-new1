package com.cydeo.labs.lab5_string;

public class Palindrome {

    public static void main(String[] args) {

        String str = "Level";
        // Write your code
        String reverseStr= "";

        for (int i = str.length() -1; i >= 0; i--) {
           reverseStr += str.charAt(i);
        }
        //this is conditions that we put to compare words
      if(str.equalsIgnoreCase(reverseStr)){
          System.out.println("Palidrome");
      }else{
          System.out.println("Not Palidrome");

      }

    }
}
/*
Write a program that can determine whether a given sting is a palindrome
- Palindrome is a string that reads the same forward and backward
The solution should handle different string lengths effectively, and handle some sensitivity appropriately.

Ex: str "level"
output : str "level;
 */