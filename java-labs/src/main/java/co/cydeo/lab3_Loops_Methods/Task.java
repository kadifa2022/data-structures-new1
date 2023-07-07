package co.cydeo.lab3_Loops_Methods;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {


        System.out.println("Welcome to Best Pizza in Town");
        System.out.println("Please log in before placing the order");

        // create 3 variables named email(String), account number(int), password and assign values
        String email= "mike@gmail.com";
        int accountNumber = 123;// account number can be between 100 amd 1000
        String password = "password";

        // Ask customer if he/she wants to log in with email (1) or account number(2)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose your log in type. Email:1 , Account Number:2");
        int loginType = scanner.nextInt();

        for (int i = 3; i > 0; ) {// infinite loop and we put everything inside
            // create the selection flow for the login type
            // switch we are using for exact match
            switch (loginType) {
                case 1:
                    // Enter your email
                    System.out.println("Enter your email: ");
                    String givenEmail = scanner.next();



                   if(!isEmailValid(givenEmail) ){
                       System.out.println("Invalid Email. Please try again..");
                       continue;
                   }


                    //Enter you password
                    System.out.println("Please enter your password: ");
                    String givenPassword = scanner.next();

                    //check if login successfully
                    if ((email.equals(givenEmail) && password.equals(givenPassword))) {
                        System.out.println("Successfully logged in with email");
                        break;

                    } else {

                        if(i!=1){//ask again if i=3
                            System.out.println("Invalid Credential !! left " + (i-1) + "chances to try");
                            i--;
                            continue;// do not execute anything after this point
                            //break: stop the loop here, and exit the loop
                            //return: stop the method that you are inside

                    }else {
                            System.out.println("Your account is locked- try again tomorrow");
                            System.exit(0);// close the execution of JVM
                        }
                        }
                case 2:
                    System.out.println("Account number is chosen");
                    break;// stop the switch case
            }
            break;// to stop for loop
        }

    }
    public static boolean isEmailValid(String givenEmail) {


        //Check if email address is valid// if@.available, and @ is before .
        int firstSignOfIndex = givenEmail.indexOf('@'); // if  not existing index of will return -1
        int secondSignOfIndex = givenEmail.indexOf('.');

        //creating invalid condition
        boolean checkEmail = secondSignOfIndex < firstSignOfIndex || firstSignOfIndex < 0 || secondSignOfIndex < 0;// invalid
        if (checkEmail) {
            return false;

        }
        return isEmailDomainValid(givenEmail);
    }
    public static boolean isEmailDomainValid(String givenEmail) {


        //check if domain is valid//gmail and  hotmail domain ->"mike@gmail.com
        String domain = givenEmail.substring(givenEmail.indexOf('@') + 1, givenEmail.indexOf('.'));
        boolean checkDomain = domain.equalsIgnoreCase("gmail") || domain.equalsIgnoreCase("hotmail");

      return checkDomain;
    }


    }



