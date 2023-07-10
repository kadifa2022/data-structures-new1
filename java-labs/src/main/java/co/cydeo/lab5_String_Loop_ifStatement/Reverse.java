package co.cydeo.lab5_String_Loop_ifStatement;

public class Reverse {

    public static void main(String[] args) {
        String word = "Wooden spoon";
        String result ="";// storing string variable


        for (int i = word.length() -1; i >=0 ; i--) {//i: index number of the string (word) starting from last to 0
             char each = word.charAt(i);//character; starting from last to first character
             result +=each;//concatenating each character

        }

        System.out.println(result);
    }
}
