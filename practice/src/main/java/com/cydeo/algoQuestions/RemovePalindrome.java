package com.cydeo.algoQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindrome {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("JAVA", "Python", "Car", "Level","Civic"));
        System.out.println(removePalindrome1(names));

    }
    public static List<String> removePalindrome1(List<String> list){
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String word = it.next();
            String reversed = "";
            for (int i = word.length() -1; i >=0 ; i--) {
                reversed +=word.charAt(i);
            }
            if(word.equalsIgnoreCase(reversed))
                it.remove();
        }
        return list;
    }

    //solution 2
    public List<String> removePalindrome2(List<String> list){
        list.removeIf(p->isPalindrome(p));
        return list;
    }
    public static boolean isPalindrome(String str){
        String reversed = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed += str.charAt(i);

        }
        return reversed.equalsIgnoreCase(str);
    }



}
//remove Palindrome from the list of Spring