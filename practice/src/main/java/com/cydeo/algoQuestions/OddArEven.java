package com.cydeo.algoQuestions;

import java.util.Scanner;

public class OddArEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number:");
            int number = input.nextInt();
            if(number %2==0){
                System.out.println(number + "is even number");
            }else{
                System.out.println(number + "is add number");
            }
            System.out.println("Would you like to enter another number? Yes/ No");
            String answer = input.next().toLowerCase();
            while(!(answer.equals("Yes") || answer.equals("No"))){
                System.err.println("Invalid Entry! Would you like to enter another number? Yes/ No");
                        answer = input.next().toLowerCase();

            }
            if(answer.equals("No")){
                break;
            }
        }
    }
}
