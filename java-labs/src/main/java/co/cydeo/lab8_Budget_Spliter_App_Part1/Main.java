package co.cydeo.lab8_Budget_Spliter_App_Part1;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//we create object from scanner to use feature of the class(methods /next(), nextLine, nextInt..)

        System.out.println("Welcome to Budget Planer!");
        System.out.println("How many people will split the budget");

        ArrayList<User> userList = prepareUserList(scanner);// User DB
        ArrayList<Expense> expenseList = new ArrayList<>();// this is my Expense DB
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
                    expense.expenseName = scanner.next();
                    System.out.println("Expense  Amount: ");
                    expense.amount = scanner.nextInt();
                    System.out.println("Which user make this expense? Just type user id: ");

                    //show all users:id :0 name:ozzy
                    for (User user : userList) {
                        System.out.println("id: " + userList.indexOf(user) + "name: " + user.name);
                    }
                    int userId = scanner.nextInt();
                    User user = userList.get(userId);
                    expense.user = user.name;
                    expenseList.add(expense);
                    break;

                case 1:
                    System.out.println("Please provide user name that you would like to search");

                    String userName = scanner.next();
                    User myUser = null;
                    for (User chosenUser : userList) {
                        if(chosenUser.name.equals(userName)){
                           myUser = chosenUser;
                           break;
                        }
                    }
                    if (myUser==null){
                        System.out.println("User not exist");
                        break;
                    }
                    //List Specific Person Expenses
                    //0:expense amount : 100, expense by :Ozzy
                    //1:expense amount : 100, expense by :Ozzy
                    //ozzy spent $200

                    int userExpenseAmount=0;
                    int expenseCount=0;//will increase count when is if statement true

                    for (int i = 0; i <expenseList.size() ; i++) {//
                        if(expenseList.get(i).user.equals(userName)){
                            userExpenseAmount += expenseList.get(i).amount;// to find the total amount
                            expenseCount++;

                            System.out.println(expenseCount + "expense amount" + expenseList.get(i).amount +", expense by :" + expenseList.get(i).user );
                        }
                    }
                    System.out.println(myUser.name + "spent $ " + userExpenseAmount);
                    break;

                    case 2:
                    for (int i = 0; i < expenseList.size() ; i++) {// to get all expenses
                        System.out.println(i+ "expense amount:" + expenseList.get(i).amount+ "Expense by: " + expenseList.get(i).user);
                    }
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


    public static ArrayList<User> prepareUserList(Scanner scanner) {

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

    public static String[] prepareOptionList() {
          /*
        //2. Menu Selection (Creating options) // will create aa
        0: Make Expense
        1: List Specific Person expense
        2: List all Expenses
        3: Make split
        4: List all users
        5: Close the Budget
        */
        String[] optionList = {"Make Expense", "List Specific Person Expense", "List all expenses", "Make Split", "List all users", "Close the budget"};
        ;

        return optionList;
    }


}
