package lab5_String;

import java.util.Scanner;

public class PrintEach {
    public static void main(String[] args) {

        String word = new Scanner(System.in).nextLine(); // scanner object

        for(int i =0; i <= word.length()-1; i++){

            char eachCharacter = word.charAt(i);
            System.out.print(eachCharacter);
        }
    }
}
