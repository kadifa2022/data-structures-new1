package co.cydeo.lab3pizzaApp1_Loops_Methods;

import java.util.Scanner;

public class PizzaApp {
    public static void main(String[] args) {


        System.out.println("Welcome to Best Pizza in Town");
        System.out.println("Please log in before placing the order");
        String email = "mike@gmail.com";

        makeOrder(login());

    }

    public static void makeOrder(String email) {
        for (int i = 0; i < 1; ) {

            System.out.println("Which pizza would you like to have. (Please type pizza  name. To create your own pizza, please type special)");

            Scanner scanner = new Scanner(System.in);
            String pizzaChoice = scanner.nextLine();


            // selection statements -> in the system we have 3 kinds of pizza, Salami, Marg, Meat Lover,Special
            if (checkPizzaThatWeHave(pizzaChoice)) {// valid  pizza
                if (pizzaChoice.equals("special")) {//special pizza
                    // build your pizza
                    System.out.println("Building my own pizza");

                } else {// ready pizza in the system
                    System.out.println("We have received your order. Price is $19.99 ");

                }
                System.out.println("Your order number is " + generateOrderNumber(email));
                break;

            } else {
                System.out.println("You have entered invalid pizza name. Please try again");
            }
        }

    }

    private static String generateOrderNumber(String email) {// order_m0i1k2e3@gmail.com

        String orderNumber = "order_";
        for (int i = 0; email.length() > i + 1; i++) {
            orderNumber += email.substring(i, i + 1); //mike@gmail.com->m0i1k2e3@gmail.com
            orderNumber += i;
        }
        return orderNumber;


    }

    private static boolean checkPizzaThatWeHave(String pizzaChoice) {
        String pizza1 = "Margarita";
        String pizza2 = "Salami";
        String pizza3 = "Veggie";
        String pizza4 = "fourCheese";
        String pizzaSpecial = "Special";

        return pizzaChoice.equals(pizza1) ||
                pizzaChoice.equals(pizza2) ||
                pizzaChoice.equals(pizza3) ||
                pizzaChoice.equals(pizza4) ||
                pizzaChoice.equals(pizzaSpecial);


    }

    public static String login() {

        // create 3 variables named email(String), account number(int), password and assign values
        String email = "mike@gmail.com";
        int accountNumber = 123;// account number can be between 100 amd 1000
        String password = "password";

        // Ask customer if he/she wants to log in with email (1) or account number(2)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose your log in type. Email:1 , Account Number:2");
        int loginType = scanner.nextInt();

        for (int i = 3; i > 0; ) {// infinite loop// we put everything inside loop switch, if statement, methods
            // create the selection flow for the login type
            // switch we are using for exact match
            switch (loginType) {
                case 1:
                    // Enter your email
                    System.out.println("Enter your email: ");
                    String givenEmail = scanner.next();

                    if (!isInputValid(givenEmail)) {
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

                        if (i != 1) {//ask again if i=3
                            System.out.println("Invalid Credential !! left " + (i - 1) + "chances to try");
                            i--;
                            continue;// do not execute anything after this point
                            //break: stop the loop here, and exit the loop
                            //return: stop the method that you are inside

                        } else {
                            System.out.println("Your account is locked- try again tomorrow");
                            System.exit(0);// close the execution of JVM
                        }
                    }
                case 2:
                    System.out.println("Please type your account number");
                    int an = scanner.nextInt();


                    // invalid and try again
                    if (!isInputValid(an)) {
                        System.out.println("Invalid Account Number. Try again");
                        continue;

                    }
                    System.out.println("Please enter your password");
                    givenPassword = scanner.next();

                    //check if login successfully
                    if (an == accountNumber && password.equals(givenPassword)) {
                        System.out.println("Successfully logged in with password");
                        break;

                    } else {

                        if (i != 1) {//ask again if i=3
                            System.out.println("Invalid Credential !! left " + (i - 1) + "chances to try");
                            i--;
                            continue;// do not execute anything after this point
                            //break: stop the loop here, and exit the loop
                            //return: stop the method that you are inside

                        } else {
                            System.out.println("Your account is locked- try again tomorrow");
                            System.exit(0);// close the execution of JVM
                        }


                        break;// stop the switch case
                    }
            }
            break;// to stop for loop

        }
        return email;
    }

    private static boolean isInputValid(int an) {
        boolean checkAccountNo = an >= 100 && an < 1000;
        return checkAccountNo;
    }

    public static boolean isInputValid(String givenEmail) {


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



