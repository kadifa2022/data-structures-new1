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

        String s = "Cat Cat Cat Cat Dog Dog Dog ";
         int countCat = 0;
         int countDog = 0;

        for (int i = 0; i < s.length()-3; i++) {
            String each = s.substring(i, i + 3);//creating all possible substring with 3 characters
            if(each.equals("Cat")){// if the substring is equal to cat
                countCat++;
            }
            if(each.equals("Dog")){// if the substring is equal to dog
                countDog++;
            }

        }
        System.out.println("countCat " +countCat);
        System.out.println("countDog " +countDog);

    }

}