package co.cydeo.lab13_commerce_project;

import co.cydeo.lab13_commerce_project.blance.Balance;
import co.cydeo.lab13_commerce_project.category.Category;

import co.cydeo.lab13_commerce_project.discount.Discount;


import java.util.ArrayList;
import java.util.List;

public class StaticConstants {// adding to DB my buckets for data

    public static final List<Customer> CUSTOMER_LIST = new ArrayList<>();
    public static final List<Category> CATEGORY_LIST=new ArrayList<>();

    public static final List<Product> PRODUCT_LIST= new ArrayList<>();
    public static final List<Balance> CUSTOMER_BALANCE_LIST= new ArrayList<>();
    public static final List<Balance> GIFT_CARD_BALANCE_LIST= new ArrayList<>();
    public static final List<Discount> DISCOUNT_LIST =new ArrayList<>();
    ;

}
