package co.cydeo.lab13_commerce_project;



import co.cydeo.lab13_commerce_project.category.Category;

import java.time.LocalDateTime;
import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private Double price;
    private Integer Stock;
    private Integer remainingStock;
    private UUID categoryId;// this id needs to mach with productId

    public Product(UUID id, String name, Double price, Integer stock, Integer remainingStock, UUID categoryId) {
        this.id = id;
        this.name = name;
        this.price = price;
        Stock = stock;
        this.remainingStock = remainingStock;
        this.categoryId = categoryId;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getStock() {
        return Stock;
    }

    public Integer getRemainingStock() {
        return remainingStock;
    }

    public UUID getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() throws Exception {
        for (Category category : StaticConstants.CATEGORY_LIST) {
            if (getCategoryId().toString().equals(category.getId().toString())) {
                return category.getName();
            }
        }
        //exception need to be handled who ever call this method (main class case 1:)  and this message will be added  e.message
        throw new Exception("Category not fount, " + getName());// return null if does not exist
    }

    public LocalDateTime getDeliveryDueDate() throws Exception {
        for (Category category : StaticConstants.CATEGORY_LIST){
            if(getCategoryId().toString().equals(category.getId().toString())){
                return category.findDeliveryDueDate();
            }
        }
        throw new Exception("Category could not find");
    }
}