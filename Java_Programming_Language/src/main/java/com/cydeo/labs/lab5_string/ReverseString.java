package com.cydeo.labs.lab5_string;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Cydeo School";

        String reversedStr = "";

        for (int i = str.length() -1; i >= 0 ; i--) {
            reversedStr += str.charAt(i);

        }
        System.out.println(reversedStr);
    }

}
