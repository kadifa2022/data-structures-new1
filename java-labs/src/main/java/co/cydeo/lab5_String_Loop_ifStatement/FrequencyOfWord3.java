package co.cydeo.lab5_String_Loop_ifStatement;

public class FrequencyOfWord3 {

    public static void main(String[] args) {

        String sentence = "Java Java Java Java Python C#  Ruby";

        int countJava = 0; // assuming 0 "Java" in sentence
        // loop to make sure that start from beginning to the end of the sentence
        for (int i = 0; i <=sentence.length()-4; i++) {// -4 to avoid indexAutoBanException

            // creating substring from sentence
            String each = sentence.substring(i, i+4);// creating all  possible string with 4 characters
            // in order to create substring always last index is excluded always add one more number

            if(each.equals("Java")){ //if the substring equals to Java than count will be increased by 1
                countJava++; // inc
            }

        }
        System.out.println(countJava);


        System.out.println("=================================");

        // frequency of cat

        String  s = "Cat Cat Cat Cat Dog Dog Dog";

        int countCat = 0;//assuming 0 cat in sentence
        int countDog = 0;

        for (int i =0; i <=s.length()-3; i++){

            String each= s.substring(i, i+3);//creating all possible substring with 3 characters

            if(each.equals("Cat")){// if the substring is equal to"cat"
                countCat++;
            }
            if(each.equals("Dog")){
                countDog ++;

            }
        }
        System.out.println("CountCat " + countCat);
        System.out.println("CountDog " + countDog);


    }




}
