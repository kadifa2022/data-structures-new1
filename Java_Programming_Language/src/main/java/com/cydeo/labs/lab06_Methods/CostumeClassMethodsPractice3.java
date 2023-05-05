package com.cydeo.labs.lab06_Methods;

public class CostumeClassMethodsPractice3 {

    public static void main(String[] args) {

        System.out.println("-------------------Task 12 -----doubleChar------------------------");

        System.out.println(doubleChar("The"));

        System.out.println("-------------------Task 13 -----endsLy------------------------");
        System.out.println(endsLy("Friendly"));

        System.out.println("-------------------Task 14 -----hasBad ------------------------");

        System.out.println(hasBad("xbadXX")); // true
        System.out.println(hasBad("ba"));//false -> not enough characters

        System.out.println("-------------------Task 15 -----atFirst ------------------------");
        System.out.println(atFirst("hello"));

        System.out.println("-------------------Task 16 -----isPalindrome ------------------------");
        System.out.println(isPalindrome("Java"));

    }

    //task 12

    public static String doubleChar(String str){//The
        String  result = "";//TThhee final result

        for(int i =0; i < str.length(); i ++){
            char each = str.charAt(i);
            result += each;
            result +=each;
        }
        return  result;

    }
    //task 13
    public static boolean endsLy(String str){
        return  str.endsWith("ly");
    }
    //task 14
    public static boolean hasBad(String str){
        if(str.equals("bad")){// if the string is "bad"
            return  true;
        }
        if(str.length()<4){// total character in string
            return false;
        }
        if(str.substring(0,3).equals("bad")){
            return  true;
        }
        if(str.substring(1,4). equals("bad")){
            return true;
        }
        return false;

    }
    //task 15
    public static String atFirst(String str){
        if(str.isEmpty()){
            return "@@";
        } else if (str.length() ==1) { // string length more than 1
            return str +"@";
        }else{
            return str.substring(0,2);
        }
    }

    //task 16

    public static boolean isPalindrome(String str){
        return StringUtility.reverse(str).equalsIgnoreCase(str);
    }




}
