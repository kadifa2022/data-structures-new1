package com.cydeo.ashokIT.happyCode;

public class ReverseString {
    public static void main(String[] args) {
        String str= "Interview Happy";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str){

        if(str == null){// edge case
            return null;
        }
    StringBuilder sb = new StringBuilder();// blank string
    for(int i = str.length() -1; i >= 0; i--){// iterate all elements in reverse order
        sb.append(str.charAt(i));
    }
    return sb.toString();// converting to string

    }




}
