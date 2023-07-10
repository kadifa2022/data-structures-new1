package co.cydeo.lab5_String_Loop_ifStatement;

import java.util.Scanner;

public class PrintEach {
    public static void main(String[] args) {

        String word = new Scanner(System.in).nextLine();

   /*
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4));

    */
        for (int i = 0; i <= word.length() - 1; i++) {
            char each = word.charAt(i);
            System.out.print(each);
        }
    }
}