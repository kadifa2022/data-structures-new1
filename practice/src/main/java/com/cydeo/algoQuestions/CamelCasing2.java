package com.cydeo.algoQuestions;

public class CamelCasing2 {

    public static void main(String[] args) {

        System.out.println( camelCasing("Ta ba ne   "));

    }

    public static String camelCasing(String input){
        String output="";
        for(char ch: input.toCharArray()){
            output= Character.isUpperCase(ch)? output + " " +ch:output + ch;
        }
        return output.trim();
    }
}
