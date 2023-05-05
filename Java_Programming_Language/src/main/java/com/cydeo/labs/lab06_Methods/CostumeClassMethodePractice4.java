package com.cydeo.labs.lab06_Methods;

public class CostumeClassMethodePractice4 {

    public static void main(String[] args) {
        String unique = "";

        String str = "aaaabbbbcccdeeef";
        for (int i = 0; i <str.length() ; i++) {
          /*
            char each = str.charAt(i);
            int f = StringUtility.frequency(str, each);
            if(f==1){
                unique += each;
            }

           *///solution 1

            if(StringUtility.frequency(str, str.charAt(i)) ==1){// solution2 shorter
                unique +=str.charAt(i);
            }
        }
        System.out.println(unique);



        System.out.println("----------------------------------");

        String s = "aaabbc";



    }
}
