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
    //frequencyOfSentenceAndWord
    public static int frequency(String sentence, String word){// solution 2

        int count= 0;
        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        return count;
    }
    //                          "aabacde"      'a' // to find frequency of one  character
    public static int frequency(String str, char ch){// frequency of string and char
        int count =0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) ==ch){
                count ++;
            }

        }
        return count;

    }

    public static String reverse(String word){

        String result = "";

        for (int i = word.length() -1; i >= 0;  i--) {
            char each = word.charAt(i);
            result +=each;

        }
        return result;

    }

    public static String removeDup(String str){
        String result = "";

        for (int i = 0; i < str.length(); i ++){
            char each = str.charAt(i);
            if(!result.contains(""+each)){
                result += each;
            }
        }
        return  result;
    }











}
