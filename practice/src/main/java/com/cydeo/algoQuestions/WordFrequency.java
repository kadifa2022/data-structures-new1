package com.cydeo.algoQuestions;

import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.asList;

public class WordFrequency {
    public static void main(String[] args) {
       wordFreq();

    }

    public static void wordFreq(){

        String text= "Ann while Bob had   had had    had had a    better     effect on on the teacher";
        Map<String, Integer> freqMap = new HashMap<>();

        asList(text.split(" +")).forEach(s ->{
            if(freqMap.containsKey(s)){
                Integer count= freqMap.get(s);
                freqMap.put(s, count+1);
            }else{
                freqMap.put(s, 1);

            }

        });
        System.out.println(freqMap.toString());
    }


}



/*
         //used regex" +" plus don't count empty spaces
        //Split the sentence into word list
        //loop on the word list
        //if hashmap contains the given word, increment the frequency count
        //else put the word into hashmap and ser its frequency as 1


 */