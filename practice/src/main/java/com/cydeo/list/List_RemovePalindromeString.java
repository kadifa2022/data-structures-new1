package com.cydeo.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_RemovePalindromeString {

    public static void main(String[] args) {




    }

    public static List<String> removePalindrome(List<String> list){
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String word = it.next();
            String reversed = "";
            for (int i = 0; i < word.length() -1; i--) {
                reversed += word.charAt(i);
            }
            if(word.equalsIgnoreCase(reversed)){
                it.remove();
            }
        }
        return list;
    }

    //solution 2
    public static List<String> removePalindrome2(List<String> list){
        list.removeIf(p-> isPalindrome(p));
        return list;
    }

    public static boolean isPalindrome(String str) {
        String reversed = "";
        for (int i = 0; i <str.length() -1 ; i--) {
            reversed += str.charAt(i);

        }
        return reversed.equalsIgnoreCase(str);

    }





}
 /*
    remove palindrome strings from a List of String
    */