package co.cydeo.lab5_String_Loop_ifStatement;

public class FrequencyOfWord3 {

    public static void main(String[] args) {

        String sentence = "Java Java Java Java Python C#  Ruby";

        int countJava = 0; // assuming 0 "Java" in sentence
        // loop to make sure that start from beginning to the end of the sentence
        for (int i = 0; i <=sentence.length()-4; i++) {// -4 to avoid indexAutoBanException
            // creating each possible string with 4 characters
            // creating substring from sentence
            String each = sentence.substring(i, i+4);// in order to create substring always last index is excluded always add one more number

            if(each.equals("Java")){ //if the substring equals to Java than count will be increased by 1
                countJava++; // inc
            }

        }
        System.out.println(countJava);

    }
}
