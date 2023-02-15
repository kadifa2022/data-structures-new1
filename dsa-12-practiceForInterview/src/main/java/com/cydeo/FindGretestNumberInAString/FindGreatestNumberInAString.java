package com.cydeo.FindGretestNumberInAString;

public class FindGreatestNumberInAString {

    public static void main(String[] args) {
        System.out.println(greatestNumInString("h898sag1222"));

    }

    static int greatestNumInString(String str) {


        int num = 0;
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                num = num * 10 + (str.charAt(i) - '0');
            else {
                result = Math.max(result, num);
                num = 0;
            }
        }
        return Math.max(result, num);
    }
}