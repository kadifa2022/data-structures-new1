package com.cydeo.labs.lab06_Methods;

public class CostumeClassMethodsPractice_1 {
    public static void main(String[] args) {
        //assigned to str - > because we will reuse the same variable
        String str1 = helloName("Bob");//

        System.out.println(helloName("Bob"));

        System.out.println("--------------------------------------------------------------");
        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println("--------------------------------------------------------------");
        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("Hi"));
        System.out.println(extraEnd("a"));
        System.out.println("--------------------------------------------------------------");
        System.out.println(firstTwo("Hello"));
        System.out.println(firstTwo("Mama"));
        System.out.println(firstTwo("x"));
        System.out.println("--------------------------------------------------------------");
        System.out.println(withOutFirstAndLastChar("Hello"));


    }

    public static String helloName(String name) {
        String result = "Hello" + name + "!";
        return result;

    }
//
//    public static void helloName2(String name){// void method
//        String result  = "Hello " +name+ "!";
//        System.out.println(result);
//    }


    public static String makeAbba(String a, String b) {
        String result = a + b + a + b; // co

//        result +=a;
//        result +=b;
//        result +=a;
//        result +=b;
        return result;
    }

    public static String extraEnd(String str) {
        if (str.length() < 2) {
            return str;
        }
//        String substring = str.substring(str.length()-2); // last 2 characters of the string  and repeat () can be added to this line
//        String result = substring.repeat(3);// substring repeated 3 time and return concatenation
//        return result;
        return str.substring(str.length() - 2).repeat(3);// second way
    }


    public static String firstTwo(String str) {// string has to be given
    /*   solution 1
     if(str.length()<2){// make sure string has at least 2 characters
            return str;// return itself
        }

        return "" +str.charAt(0) + str.charAt(1);//" " this mean that we those two charAt() converted to the string
    }

     */
        if(str.length()>2){// solution 2
            return str.substring(0,2);
        }else{
            return str;

        }
    }

    public static String withOutFirstAndLastChar(String str){
        if(str.length()>=3){
            return str.substring(1, str.length()-1);// start to creating substring from second char to the last-1
        }else{
            return  str;
        }


    }




}