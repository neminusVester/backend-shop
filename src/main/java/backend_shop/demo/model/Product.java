package backend_shop.demo.model;

import java.math.BigDecimal;

public class Product {

    private int id;
    private String name;
    private String category;
    private double price;
    private int quantity;

    public Product (int id, String  name, String category, double price, int quantity ) {
        setId(id);
        setName(name);
        setCategory(category);
        setPrice(price);
        setQuantity(quantity);
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setCategory(String category) {
        this.category = category;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

    public double getPrice() {
        return this.price;
    }

    public float getQuantity() {
        return this.quantity;
    }
}
