package com.cydeo.labs.lab5_string;

public class FrequencyOfWord3 {
    public static void main(String[] args) {
        String sentence = "Java Java Java Java Java Java C# Ruby Python Java";
        int countJava = 0;
        for (int i = 0; i <= sentence.length() - 4; i++) {
            String each = sentence.substring(i, i + 4);//creating all possible substring with 4 characters
            if (each.equals("Java")) {// if the substring equals"Java'
                countJava++;// increase acccount

            }

        }
        System.out.println(countJava);

        System.out.println("---------------------------------------------");

        String s = "Cat Cat Cat Cat Dog Dog Dog";
         int countCat = 0;
        for (int i = 0; i < s.length()-3; i++) {
            String each = s.substring(i, i + 3);
            if(each.equals("Cat")){
                countCat++;
            }

        }
        System.out.println(countCat);

    }

}