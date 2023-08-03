package com.cydeo.javaCoreMuhtar;

import java.util.Arrays;

public class AnagramProblem {
    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "earth";
        //Write code here

        char [] arr1 = str1.toCharArray();// putting string in arr and comparing each char n
        char [] arr2 = str2.toCharArray();// putting second string in char arr

//
        Arrays.sort(arr1);// sorting strings
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }





    }
}
/*
Write a program that can determine whether two given strings are anagram of each other.
An Anagram is a word of phrase forward by rearranging the letters of another word or phrase.
The solution should handle strings of varying lengths, including whitespace and punctuation marks.

Ex:
str 1 = "Heart"  // a e h r t  we need to sort each string and compare characters
str2 = "earth"  // a e h r t

Output :
Anagram
 */
