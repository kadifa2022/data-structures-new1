package com.cydeo.algoQuestions;

public class ReverseString {
    public static void main(String[] args) {
        String str = "The sky is blue";

        String reverse = "";
        for(int i = str.length() -1; i >=0; i--){
            reverse += str.charAt(i);

        }
        System.out.println(reverse);
    }

}
