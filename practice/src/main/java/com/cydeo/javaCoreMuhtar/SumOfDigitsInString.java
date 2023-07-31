package com.cydeo.javaCoreMuhtar;

public class SumOfDigitsInString {

    public static void main(String[] args) {

        String str = "1bc2e3gthca4";

      int  sum = 0;

        for (int i = 0; i<str.length() ; i++){
            char ch = str.charAt(i);
            if (Character.isDigit(ch)){
               sum += Integer.parseInt("" + ch);


            }
        }

        System.out.println(sum);
    }
}
