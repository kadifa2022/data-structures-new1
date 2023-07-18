package co.cydeo.lab13_commerce_project;



import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private Double price;
    private Integer  Stock;
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
}
