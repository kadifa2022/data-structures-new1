package com.cydeo.ashokIT;

public class ReverseEachWord {

    public static void main(String[] args) {

        String input = "Java code";// taking a string as input
        System.out.println("Original String :  " + input);// printing as is

        String output =""; // declaring output variable to print final output
        //string array of words
        String [] words = input.split(" ");// using delimiter to split string based on space
        for(String word : words){// getting each word from the array
            // reverse word
            String revWord = "";//declaring variable for reversed words
            for(int i = word.length()-1; i>=0; i--){// reversing the string
                revWord = revWord + word.charAt(i);// storing

            }
            output = output + revWord + " ";

        }
        System.out.println("Reversed word : " + output);
    }
}
