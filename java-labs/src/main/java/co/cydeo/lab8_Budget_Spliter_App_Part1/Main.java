package co.cydeo.lab8_Budget_Spliter_App_Part1;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//we create object from scanner to use feature of the class(methods /next(), nextLine, nextInt..)

        System.out.println("Welcome to Budget Planer!");
        System.out.println("How many people will split the budget");

        ArrayList<User> userList = prepareUserList(scanner);
        System.out.println("Added user account: " + userList.size());// how many user added

        String[] optionList = prepareOptionList();


        while (true) {

            System.out.println("What would you like to do ?");

            for (int i = 0; i < optionList.length; i++) {
                System.out.println(optionList[i] + ":" + (i + 1));

            }
            int request = scanner.nextInt();
            switch (request - 1) {
                case 0:
                    Expense expense = new Expense(); // creating object
                    System.out.println("Expense name: ");
                    expense.expenseName= scanner.next();
                    System.out.println("Expense  Amount: ");
                    expense.amount = scanner.nextInt();
                    System.out.println("Which user make this expense? Just type user id: ");
                   
                   //show all users:id :0 name:ozzy
                    for (User user : userList) {
                        System.out.println("id: " + userList.indexOf(user) + "name: " + user.name);
                    }
                    int userId = scanner.nextInt();



                case 1:
                    System.out.println("List Specific Person Expense");
                    break;
                case 2:

                    System.out.println("List all expenses");
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    break;
                case 5:

                    System.exit(0);


            }


        }

    }





        //1. Create user


       public  static ArrayList<User> prepareUserList(Scanner scanner) {

           ArrayList<User> userList = new ArrayList<>();// we create arrayList to hold  all objects belongs to user class

           int userCount = scanner.nextInt();// input 3 people

           for (int i = 0; i < userCount; i++) {// for repeated actions

               User user = new User();// create user object

               System.out.println("Name: ");
               user.name = scanner.next();

               System.out.println("Email: ");
               user.email = scanner.next();

               userList.add(user);// saving the object

           }
           return userList;
       }

       public static String [] prepareOptionList(){
          /*
        //2. Menu Selection (Creating options) // will create aa
        0: Make Expense
        1: List Specific Person expense
        2: List all Expenses
        3: Make split
        4: List all users
        5: Close the Budget
        */
          String [] optionList  = {"Make Expense", "List Specific Person Expense", "List all expenses", "Make Split", "List all users", "Close the budget"};          ;

        return optionList;
       }


}
