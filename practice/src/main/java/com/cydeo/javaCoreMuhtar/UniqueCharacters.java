package com.cydeo.javaCoreMuhtar;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabccdee";


        // write your code
        String uniques = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            // condition if the character appears only one time in the string
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                uniques +=ch;// add to uniques string
            }
        }
        System.out.println(uniques);
    }

}
/*
Write the program that they can  identify and return only the unique characters presented in a given string.
Tha solution should handle alphanumeric characters, whitespace, and special characters. It should also handle
different string lengths effectively, and preserve the order of unique characters.
Ex:
str = "aabccdee"
output: bd

 */
