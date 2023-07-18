package co.cydeo.lab13_commerce_project;

import co.cydeo.lab13_commerce_project.category.Category;

import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private double price;
    private String Stock;
    private String remainingStock;
    private Category category;
}
