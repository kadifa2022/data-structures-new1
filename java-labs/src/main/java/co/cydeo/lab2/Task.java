package co.cydeo.lab2;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {


        System.out.println("Welcome to Best Pizza in Town");
        System.out.println("Please log in before placing the order");

        // create 3 variables named email(String), account number(int), password and assign values

        String email= "Mike@gmail.com";
        int accountNumber = 123;// account number can be between 100 amd 1000
        String password = "password";
        // Ask customer if he/she wants to log in with email (1) or account number(2)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose your log in type. Email:1 , Account Number:2");
        int loginType =scanner.nextInt();

        // create the selection flow for the login type

        // switch we are using for exact match
        switch(loginType){

            case 1:
                // Enter your email
                System.out.println("Enter your email");
                String givenEmail = scanner.next();

                //Check if email address is valid// if@.available, and @ is before .
                int firstSignOfIndex = givenEmail.indexOf('@'); // if  not existing index of will return -1
                int secondSignOfIndex = givenEmail.indexOf('.');

                //creating invalid condition
                boolean checkEmail = secondSignOfIndex<firstSignOfIndex || firstSignOfIndex< 0 || secondSignOfIndex<0;

                if(checkEmail){
                    System.out.println("Invalid Email Address");
                    return;
                }
                //check if domain is valid//gmail and  hotmail domain ->"mike@gmail.com

                String domain = givenEmail.substring(givenEmail.indexOf('@') +1,givenEmail.indexOf('.'));
                boolean checkDomain = domain.equalsIgnoreCase("gmail") || domain.equalsIgnoreCase("hotmail");
                if(!checkDomain){
                    System.out.println("Invalid Domain");
                }

                //Enter you password
                System.out.println("Please enter your password: ");
                String givenPassword = scanner.next();

                //check if login successfully
                if((email.equals(givenEmail) && password.equals(givenPassword))){

                System.out.println("Successfully logged in with email");

                }else{

                    System.out.println("Invalid Credential");
                    return;
                }


            case 2:
                System.out.println("Account number is chosen");
                break;
        }

    }


}
