package com.cydeo.labs.lab5_string;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "zyxxyzxyzyxz";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);//after i got each character
            // if(result.indexOf(each)<0){
            if (!result.contains("" + each)) { //to avoid duplicates// before adding the character to the new String// we check if the character is not included in to new string// if is n ot included we can added
                // " " char to string -> to the empty string
                result += each;// add to the new string result

            }
        }
        System.out.println(result);
    }
}