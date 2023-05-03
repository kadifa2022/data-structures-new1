package com.cydeo.labs.lab5_string;

public class FrequencyOfWord2 {

    public static void main(String[] args) {
        String sentence = "Java Java Java  Java Python C# Java Ruby";
        int countJava = 0;
        //sentence.indexOf("Java")>=0 one way of boolean expressin
        // another expression
        while (sentence.contains("Java")) {// while sentence contains Java
            sentence = sentence.replaceFirst("Java", " ");// remove one "Java' at the time
            countJava++;// increase the number of java by 1
        }
        System.out.println(countJava);
    }
}

/*
While loop (condition){// boo=lean if we don't know

 */