package com.geekbrains;

public class Product {
    Integer id;
    String title;
    Float cost;

    public Product(Integer id, String title, Float cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public String getInfoProduct() {
        return id + ". " + title + ": " + cost + "$.";
    }
}
