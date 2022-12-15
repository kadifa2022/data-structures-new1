package com.cydeo.algoQuestions;

import java.util.HashMap;
import java.util.Map;

public class ReturnFrequencyOfWords {
    public static void main(String[] args) {
        //create string array
        String[] allWords= {"This is an example of example"};
        returnWordFrequency( "         This!          is an Example of example");



    }




    public static Map<String, Integer>returnWordFrequency(String str){
        str=str.trim();

        str = str.replaceAll("[^a-zA-Z0-9]", " ");
        //split the sentence into words with regex
        String[] allWords= str.split(" +");

        Map<String, Integer> freqMap= new HashMap<>();
        for(String word : allWords){
            word = word.toLowerCase();
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }
        System.out.println(freqMap);
        return freqMap;




    }
}







/*
Write a method that returns count the number of times each word appears in
the sentence.
Note: Use proper regex.

Conststrains : insensitive.
Example 1: Example 2:

input: This is an example of
example

output: {of=1, this=1, is=1,
an=1, example=2}

input: “This” is an
example!
 of Example…
output: {of=1, this=1, is=1,
an=1, example=2}



 */