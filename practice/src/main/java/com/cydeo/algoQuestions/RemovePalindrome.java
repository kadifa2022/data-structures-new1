package com.cydeo.algoQuestions;

import java.util.Iterator;
import java.util.List;

public class RemovePalindrome {
    public static void main(String[] args) {

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

}
//remove Palindrome from the list of Spring