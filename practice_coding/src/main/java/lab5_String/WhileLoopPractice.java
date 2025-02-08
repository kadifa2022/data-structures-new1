package lab5_String;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Would you like to continue yes/no");
        String a = input.nextLine().toLowerCase();// everything will be  converted to lowerCase

        while( !(a.equals("yes") || a.equals("no"))){
            System.err.println("Invalid entry! Would you like to continue? Yes/ No");
            a = input.nextLine().toLowerCase();

        }


    }
}
