package co.cydeo.lab5_String_Loop_ifStatement;

public class FrequencyOfWord {

    public static void main(String[] args) {// interview ?

/*
        String sentence = "Java Java Java Python C#  Ruby";

        // first we are finding how many characters we have in sentence
        int original_length = sentence.length();

        String temp = sentence;// created temp value and assign string//"Java Java Java Python C#  Ruby"

        temp = temp.replace("Java", "aaa");//"aaa aaa aaa Python C#  Ruby"

        int new_length = temp.length();// storing new length

        System.out.println(original_length);//30
        System.out.println(new_length);//27

        int totalNumberOfJava= original_length - new_length;
        System.out.println(totalNumberOfJava);

 */


        String sentence = "Java Java Java Java Python C#  Ruby";

        String temp = sentence.replace("Java", "abc");//"abc abc abc abc Python C#  Ruby"

        int totalNumberOfJava = sentence.length() - temp.length();
        System.out.println(totalNumberOfJava);




    }
}
