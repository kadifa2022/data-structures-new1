package co.cydeo.lab13_commerce_project;

import co.cydeo.lab13_commerce_project.blance.Balance;
import co.cydeo.lab13_commerce_project.blance.CustomerBalance;
import co.cydeo.lab13_commerce_project.blance.GiftCardBalance;
import co.cydeo.lab13_commerce_project.category.Category;
import co.cydeo.lab13_commerce_project.discount.Discount;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

public class main {

    public static void main(String[] args) {

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
            Cart cart = new Cart(customer);// empty cart for customer


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
                        catch (Exception e){                                                 // from product class    throw new Exception("Category not fount, " + getName())
                            System.out.println("Product could not printed because category not found for product name" + e.getMessage().split(",") [1]);}
                        break;

                    case 2:// list discount
                        for (Discount discount : StaticConstants.DISCOUNT_LIST) {
                            System.out.println("Discount Name "+ discount.getName() +"discount threshold amount: " + discount.getThresholdAmount());
                        }
                        break;

                    case 3://See balance
                        CustomerBalance cBalance = findCustomerBalance(customer.getId());
                        GiftCardBalance gBalance = findGiftCartBalance(customer.getId());
                        double totalBalance = cBalance.getBalance() + gBalance.getBalance();
                        System.out.println("Total Balance: " + totalBalance);
                        System.out.println("Customer Balance: " + cBalance.getBalance());
                        System.out.println("Gift Cart Balance: " + gBalance.getBalance());
                        break;

                    case 4://Add balance
                        CustomerBalance customerBalance = findCustomerBalance(customer.getId());
                        GiftCardBalance giftCardBalance = findGiftCartBalance(customer.getId());
                        System.out.println("Which account would you like to add? ");
                        System.out.println("Type 1 for Customer balance: " + customerBalance.getBalance());
                        System.out.println("Type 2 for Gift Cart  balance: " + giftCardBalance.getBalance());
                        int balanceAccountSelection = scanner.nextInt();
                        System.out.println("How much would you like to add? ");
                        double additionalAmount = scanner.nextInt();

                        switch (balanceAccountSelection){
                            case 1:
                                customerBalance.addBalance(additionalAmount);
                                System.out.println("New Customer Balance:" +customerBalance.getBalance());
                                break;
                            case 2:
                                giftCardBalance.addBalance(additionalAmount);
                                System.out.println("New Gift Cart Balance: " +giftCardBalance.getBalance());
                                break;
                        }
                        break;

                    case 5://Place an order
                        Map<Product, Integer> map = new HashMap<>();
                        cart.setProductMap(map);// my empty cart
                        while (true){// while loop  to keep adding product to cart
                            System.out.println("Which product you want to add to your cart. For exit product selection Type: Exit");// telling use to make selections
                            for(Product product: StaticConstants.PRODUCT_LIST){// listing all the products
                                try{
                                System.out.println("id: " +product.getId()+ "price:" +product.getPrice() +// based on product id,user will make selections
                                        "product category" + product.getCategoryName() +
                                        "stock: " + product.getRemainingStock() +
                                        "product delivery due:" + product.getDeliveryDueDate() );

                            }catch (Exception e){
                                    System.out.println(e.getMessage());
                                }
                            }
                            String productId = scanner.next();// using unique id
                            try {
                                Product product = findProductById(productId);// have product //start adding product in cart
                                if(!putItemToCartIfStockAvailable(cart, product)){// if is enough in stack available
                                    System.out.println("Stock is insufficient. Please try again");// if the error
                                    continue;
                                }
                            } catch (Exception e) {
                                System.out.println("Product does not exist. Please try again");
                                continue;
                            }
                            System.out.println("Do you want to add more product. Type Y for adding more, N for Exit");
                            String decision = scanner.next();
                            if (!decision.equals("Y")) {
                                break;
                            }


                        }

                        break;
                    case 6://See cart
                        break;
                    case 7://See order details
                        break;
                    case 8://See your address
                        break;
                    case 9:// Close app
                        break;
                }

            }
    }

    private static boolean putItemToCartIfStockAvailable(Cart cart, Product product) {
        System.out.println("Please provide product count: ");
        Scanner scanner = new Scanner(System.in);
        int count  = scanner.nextInt();
        // how many existing product in your cart
        Integer cartCount= cart.getProductMap().get(product);
        if(cartCount != null && product.getRemainingStock() > cartCount + count ){
            cart.getProductMap().put(product, cartCount+ count);
            return true;

        }else if(product.getRemainingStock()>count){// if is more in stock than count add  to cart
            cart.getProductMap().put(product, count);
            return true;

        }
        return false;


    }

    private static Product findProductById(String productId) throws Exception {
        for(Product product: StaticConstants.PRODUCT_LIST){
            if(product.getId().toString().equals(productId)){
                return product;
            }
        }
        throw  new Exception("Product not found");
    }

    private static CustomerBalance findCustomerBalance(UUID customerId) {
        // go to db
        for (Balance customerBalance : StaticConstants.CUSTOMER_BALANCE_LIST) {
            if (customerBalance.getCustomerId().toString().equals(customerId.toString())) {
                return (CustomerBalance) customerBalance; // WE cast to customerBalance  used polymorphism
            }
        }
        CustomerBalance customerBalance = new CustomerBalance(customerId, 0d);// we need to put in DB
        StaticConstants.CUSTOMER_BALANCE_LIST.add(customerBalance);
        return customerBalance;

    }

    private static GiftCardBalance findGiftCartBalance(UUID customerId) {
        // go to db
        for (Balance giftCartBalance : StaticConstants.GIFT_CARD_BALANCE_LIST) {
            if (giftCartBalance.getCustomerId().toString().equals(customerId.toString())) {
                return (GiftCardBalance) giftCartBalance; // WE cast to customerBalance  used polymorphism
            }
        }
        GiftCardBalance giftCarBalance = new GiftCardBalance(customerId, 0d);// we need to put in DB
        StaticConstants.GIFT_CARD_BALANCE_LIST.add(giftCarBalance);
        return giftCarBalance;


    }






        //only access for this class // static
        private static String[] prepareMenuOptions(){
            return new String[]{"List Categories", "List Products", "List Discount", "See balance", "Add balance",
                    "Place an Order", "See Cart", "See Order details", "See your address", "Close App"};
        }


    }
