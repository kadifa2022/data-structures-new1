package com.cydeo.labs.lab5_string;

public class RemoveDuplicatesFromString {


    public static void main(String[] args) {

        String str = "ABCABCABCACB";

        //Write your code here:
        String result = "";//
        // in order to get each character we are using loop
        for(int i = 0; i < str.length() ; i++){
        //  char ch =  str.charAt(i);// returns us each character
            //converting to string and adding empty string
            String ch = "" + str.charAt(i);
          // checking each character in string
            if(result.contains(ch)){//when loop execute  whatever is this condition is true will be skipped nad added uniq letter
                continue;
            }
            result +=ch;
        }
        System.out.println(result);


    }

    /*
    Write a program can efficiently eliminate any duplicate character present in given string.
    The solution should handle strings of varying lengths effectively and preserve the original order of string.

    exp: String= "abcabcabcabcabb";
    output: "abc"
     */



}
