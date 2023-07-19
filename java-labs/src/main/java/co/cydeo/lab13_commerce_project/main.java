package co.cydeo.lab13_commerce_project;

import co.cydeo.lab13_commerce_project.blance.Balance;
import co.cydeo.lab13_commerce_project.category.Category;

import java.util.Scanner;

public class main {

    public static void main(String[] args) throws Exception {

        DataGenerator.createCustomer();
        DataGenerator.createCategory();
        DataGenerator.createProduct();
        DataGenerator.createBalance();
        DataGenerator.createDiscount();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Customer ");
        for (int i = 0; i < StaticConstants.CUSTOMER_LIST.size(); i++) { // foreachLoop we can't catch index number
            System.out.println("Type " + i + " for customer : " + StaticConstants.CUSTOMER_LIST.get(i).getUserName());
        }

        // get the customer object from DB-picked customer
            Customer customer = StaticConstants.CUSTOMER_LIST.get(scanner.nextInt());


            while (true) {// infinite loop for searching, until we log out
                System.out.println("What would you like to do? Just type id for selection");

                for (int i = 0; i < prepareMenuOptions().length; i++) {
                    System.out.println(i + "-" + prepareMenuOptions()[i]);
                }
                int menuSelection = scanner.nextInt();
                switch (menuSelection){
                    case 0:// list categories
                      for(Category category: StaticConstants.CATEGORY_LIST){
                          System.out.println("Category code: " + category.generateCategoryCode() + "Category name " + category.getName());
                      }
                      break;
                    case 1:// list products /product name and product category name
                        for(Product product:StaticConstants.PRODUCT_LIST)
                            try {
                                System.out.println("Product name " + product.getName() + " and product category name " + product.getCategoryName());
                            }
                        catch (Exception e){
                            System.out.println("Product could not printed because category not found for product name" + e.getMessage().split(",") [1]);
                        }
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                }

            }






        }
        //only access for this class // static
        private static String[] prepareMenuOptions(){
            return new String[]{"List Categories", "List Products", "List Discount", "See balance", "Add balance",
                    "Place an Order", "See Cart", "See Order details", "See your address", "Close App"};
        }


    }
