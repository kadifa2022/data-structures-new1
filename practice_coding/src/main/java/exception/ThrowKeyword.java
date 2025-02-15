package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {

        System.out.println("Hello");
       // throw new ArithmeticException("Wrong Calculation.");

        // throw new InterruptedException("");(can be used throws keyword aor try and catch)

        System.out.println("Enter you age: ");
        int age = new Scanner(System.in).nextInt();

        if(age<0 || age> 130){
            throw new InputMismatchException("Invalid age : " + age );
        }

        System.out.println("Age " + age);
    }
}
