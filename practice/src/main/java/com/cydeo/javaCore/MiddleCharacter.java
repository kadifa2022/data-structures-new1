package com.cydeo.javaCore;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String str = " " ;
        System.out.println(str);

        if(word.length()%2 !=0){
            if (word.length() >=3) {
                System.out.println(word.charAt(word.length()/2));

            }else {
                System.out.println(word.charAt(0) + "" + word.charAt(0) + "" + word.charAt(0));
            }
        }else {
            if(word.length()>=4){
                System.out.println(word.charAt(word.length())/2-1 + "" +word.charAt(word.length()/2));
            }else{
                System.out.println(word.concat(word));
            }

            }

    }
}
