package com.cydeo.labs.lab06_Methods;

public class CustomClassMethodsPractice_2 {
    public static void main(String[] args) {

        System.out.println("-----------------Sixth Task----------------------");
        String result1 = comboString("Mara", "Hi");
        System.out.println(result1);

        System.out.println("-----------------Seventh Task----------------------");

        System.out.println(leftTwo("Hello"));
        System.out.println("-----------------Eight Task----------------------");
        System.out.println(rightTwo("Java"));

        System.out.println("-----------------Ninth Task----------------------");
        System.out.println(frontAgain("edited"));
        System.out.println("-----------------Tenth Task----------------------");
        System.out.println(countHi("Hi Hi Hi Hi Hi"));
        System.out.println("-----------------Eleventh Task----------------------");
        System.out.println("-----------------Twelfth Task----------------------");
        System.out.println("-----------------Thirteen Task----------------------");
        System.out.println("-----------------Fourteen Task----------------------");
    }





    //task 6
    public static String comboString(String a, String b){ //question 6
        if(a.length()>b.length()){
            return  b + a + b;
        } else if (b.length() > a.length()) {
            return a + b + a;

        }else {
            return a + b;
        }


    }

    //task 7
    public static String leftTwo(String str){// Hello
        if(str.length()<3){
            return str;
        }
        String s1 = str.substring(0,2);// "He"
        String s2 = str.substring(2);// "llo" //from the 3rd characters to the end

        return s2+ s1;  // "llHe"
    }
    //task 8

    public static String rightTwo(String str1){//"Hello"
        if(str1.length()<3){
            return str1;
        }
        String s1 = str1.substring(str1.length() -2);//"lo
        String s2 = str1.substring(0, str1.length()-2);//"Hel"
        return  s1 + s2;//loHel

    }

    //task 9

    public static boolean frontAgain(String str){
        if(str.length()<2){
            return false;
        }
        /*solution 1
        String firstTwoChars = str.substring(0,2);
        String lastTwoChars = str.substring(str.length()-2);
        return firstTwoChars.equals(lastTwoChars);

         */
      //  return  str.substring(0,2).equals(str.substring(str.length()-2));// solution 2

        // solution3
        String firstTwoChars = str.substring(0,2);
        String lastTwoChars= str.substring(str.length()-2);
        return firstTwoChars.equals(lastTwoChars);


    }
    // task 10
    public static int countHi(String str){// calling frequency () from stringUtility// we reused  this method
        return StringUtility.frequencyOfSentenceAndWord(str, "Hi");

}

    // task 11
    public static boolean catDog(String str){
        str = str.toLowerCase();
        int countCat = StringUtility.frequencyOfSentenceAndWord(str, "cat");
        int countDog = StringUtility.frequencyOfSentenceAndWord(str, "dog");
        return countDog==countCat;// == return boolean T/F


    }




}
