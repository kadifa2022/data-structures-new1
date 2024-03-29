package com.cydeo.algoQuestions;

import java.util.Arrays;
import java.util.TreeSet;

public class String_Anagram {
    /* write a function that check is a string is build out of the same letters as another string.
    Exp: same("abc", "cab"); ->rue, Solution 1: same("abc", "abb")->false
     */
    //solution 1
    public static boolean isSameString(String a, String b) {
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1 = "", a2 = "";

        for (char each : ch1) {
            a1 += each;
        }
        for (char each : ch2) {
            a2 += each
            ;
        }
        return a1.equals(a2);
    }
    //solution 2

    public static boolean sameString(String a, String b) {
        a = new TreeSet<String>(Arrays.asList(a.split(""))).toString();
        b= new TreeSet<String>(Arrays.asList(b.split(""))).toString();
        return a.equals(b);
    }
}