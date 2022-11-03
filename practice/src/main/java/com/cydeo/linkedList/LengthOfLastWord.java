package com.cydeo.linkedList;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Cydeo"));


    }

    //if string has spaces and will do it using last index going backwards
    //if the string just has spaces

    //set the counter
    //if there only chars we counts
    public static int lengthOfLastWord(String str){
        int i = str.length()-1;
        while (i>= 0  && str.charAt(i) == ' '){
            i--;
        }
        if(i <=0){
            return 0;
        }
        int length = 0;
        while(i>=0 && str.charAt(i) != ' '){
            i--;
            length++;

        }
        return length;

    }

}
