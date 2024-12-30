package com.cydeo.javaCoreMuhtar;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "Ana voli Milovana ";
        System.out.println(isValidPalindrome(s));

    }
    public static boolean isValidPalindrome(String s){
        int left  = 0;
        int right = s.length()-1;
        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left ++;
            }
            while(right > left && !Character.isLetterOrDigit(s.charAt(right))){
                right --;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}
