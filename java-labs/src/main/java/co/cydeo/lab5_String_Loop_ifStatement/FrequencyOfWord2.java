package co.cydeo.lab5_String_Loop_ifStatement;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String sentence = "Java Java Java Java Python C#  Ruby";

        // we are assuming that sentence doesn't have word Java
        int countJava = 0;
       //  while(sentence.indexOf("Java")>=0 ); //one way to checked condition
        while(sentence.contains("Java")){// another way
            sentence = sentence.replaceFirst("Java", "");// remove one "Java" at the time
            countJava++;


        }
        System.out.println(countJava);




    }
}
