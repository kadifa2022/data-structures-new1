package com.cydeo.algoQuestions;

import java.util.ArrayList;

public class ExtractTheSpecialCharacters {

    public static void main(String [] args) {
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<String> letter = new ArrayList<>();
        ArrayList<String> ch = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                letter.add("" + str.charAt(i));
                if (Character.isDigit(str.charAt(i))) {
                    num.add(Integer.valueOf(str.charAt(i)));
                    if (!(Character.isLetterOrDigit(str.charAt(i)))){
                       ch.add("" + str.charAt(i));


                }
                System.out.println("list 1" + letter + "List2 " + num);


            }
        }

    }}}