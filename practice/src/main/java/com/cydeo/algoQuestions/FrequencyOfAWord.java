package com.cydeo.algoQuestions;

public class FrequencyOfAWord {
    public static void main(String [] args) {
        String sentence = "java JAVA JAva jaVA";

        String word = "Java";
        sentence = sentence.toLowerCase();
        word= word.toLowerCase();

        int count= 0;
        while (sentence.contains(word)){
            count++;
            sentence =sentence.replaceFirst(word,"");
        }
        System.out.println(count);
    }
}
