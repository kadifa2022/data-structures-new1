package com.cydeo.algoQuestions;

public class DuplicatedLetters {
    public static void main(String[] args) {
       // getNumber("tralababa");
        System.out.println(getNumber("tralababab"));
    }






    public static int getNumber(String str){
        str=str.toLowerCase();
        String temp= "";
        String output="";

        for(char ch:str.toCharArray()){
            if(!temp.contains(ch+"")){
                temp+=ch;
            }else if(!output.contains(ch+""));
            output +=ch;
        }
        return output.length();
    }
}
