package co.cydeo.lab13_commerce_project;

import co.cydeo.lab13_commerce_project.blance.Balance;
import co.cydeo.lab13_commerce_project.blance.CustomerBalance;
import co.cydeo.lab13_commerce_project.blance.GiftCardBalance;
import co.cydeo.lab13_commerce_project.category.Category;
import co.cydeo.lab13_commerce_project.category.Electronic;
import co.cydeo.lab13_commerce_project.category.Furniture;
import co.cydeo.lab13_commerce_project.category.SkinCare;
import co.cydeo.lab13_commerce_project.discount.AmountBaseDiscount;
import co.cydeo.lab13_commerce_project.discount.Discount;
import co.cydeo.lab13_commerce_project.discount.RateBaseDiscount;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DataGenerator {

    public static void createCustomer(){//sample data
        Address address1Customer1 = new Address("314" , "Charing Ln.","Suite 200", "2290", "VA");
        Address address2Customer1 = new Address("310" , "C Ln.","Suite 201", "2290", "MO");
        Address address1Customer2 = new Address("315" , "Broadway Ln.","Suite 202", "2290", "MI");

        List<Address> customer1AddressList = new ArrayList<>();
        customer1AddressList.add(address1Customer1);
        customer1AddressList.add(address2Customer1);

        Customer customer1 = new Customer(UUID.randomUUID(), "Ozzy", "ozzy@gmail.com", customer1AddressList);
        Customer customer2 = new Customer(UUID.randomUUID(), "Mike", "ozzy@gmail.com");
       // Customer customer3 = new Customer(UUID.randomUUID(), "Ozzy", "ozzy@gmail.com", customer1AddressList);

        StaticConstants.CUSTOMER_LIST.add(customer1);
        StaticConstants.CUSTOMER_LIST.add(customer2);


    }

    public static void createCategory(){
        Category category1 = new Electronic(UUID.randomUUID(), "Electronic") ;
        Category category2= new Furniture(UUID.randomUUID(), "Furniture");
        Category category3 = new SkinCare(UUID.randomUUID(), "SkinCare");

        StaticConstants.CATEGORY_LIST.add(category1);
        StaticConstants.CATEGORY_LIST.add(category2);
        StaticConstants.CATEGORY_LIST.add(category3);

        }

        public static void createProduct(){
        Product  product1= new Product(UUID.randomUUID(), "P5P", 299.00, 20,20, StaticConstants.CATEGORY_LIST.get(0).getId());
        Product  product2= new Product(UUID.randomUUID(), "XBox", 199.00, 2,2, StaticConstants.CATEGORY_LIST.get(0).getId());
        Product  product3= new Product(UUID.randomUUID(), "P5P", 299.00, 10,10, StaticConstants.CATEGORY_LIST.get(1).getId());
        Product  product4= new Product(UUID.randomUUID(), "Milk ", 2.99, 110,10, UUID.randomUUID());

        StaticConstants.PRODUCT_LIST.add(product1);
        StaticConstants.PRODUCT_LIST.add(product2);
        StaticConstants.PRODUCT_LIST.add(product3);
        StaticConstants.PRODUCT_LIST.add(product4);



    }
    public static void createBalance(){
        Balance customerBalance= new CustomerBalance(StaticConstants.CUSTOMER_LIST.get(0).getId(), 100.00);
        Balance giftCardBalance = new GiftCardBalance(StaticConstants.CUSTOMER_LIST.get(1).getId(), 200.00);

        StaticConstants.CUSTOMER_BALANCE_LIST.add(customerBalance);
        StaticConstants.GIFT_CARD_BALANCE_LIST.add(giftCardBalance);

    }

    public static void createDiscount(){

        Discount amountBaseDiscount = new AmountBaseDiscount(UUID.randomUUID(), "Buy $250 free $50",250.00, 50.00);
        Discount rateBasedDiscount = new RateBaseDiscount(UUID.randomUUID(), "Buy $250 Free %15", 500.00,15.00);
        StaticConstants.DISCOUNT_LIST.add(amountBaseDiscount);
        StaticConstants.DISCOUNT_LIST.add(rateBasedDiscount);

    }

    }





