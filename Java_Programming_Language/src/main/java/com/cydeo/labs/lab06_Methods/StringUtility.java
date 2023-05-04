package com.cydeo.labs.lab06_Methods;

public class StringUtility {

    //task 10  // solution 1
/*    public static int frequencyOfSentenceAndWord(String sentence, String word){
        int count = 0;

        for(int i = 0; i<=sentence.length() - word.length(); i ++){
            String each = sentence.substring(i, i + word.length());
            if(each.equals(word)){
                count++;
            }
        }
        return count;

    }

 */
// return the frequency of the given word from the given sentence
    public static int frequencyOfSentenceAndWord(String sentence, String word){// solution 2

        int count= 0;
        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        return count;
    }

}
