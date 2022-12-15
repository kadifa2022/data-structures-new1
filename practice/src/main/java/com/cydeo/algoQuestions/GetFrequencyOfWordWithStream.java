package com.cydeo.algoQuestions;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class GetFrequencyOfWordWithStream {
    public static void main(String[] args) {
        getFreqOfWords("     !this is example of the stream example   ");
        System.out.println(getFreqOfWords("     !this is example of the stream example   "));

    }



    public static Map<String, Long> getFreqOfWords(String str){
        return Arrays.stream(str.toLowerCase(Locale.ROOT).trim().split("\\W+"))
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
    }
}
