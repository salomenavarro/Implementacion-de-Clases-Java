package com.example;

public class Product {

    private String id;
    private String name;

    private double price;
    private int stock;

    Product() {
        this.id = "";
        this.name = "";
        this.price = 0.0;
        this.stock = 0;
    }

    Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;

    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getStock() {
        return this.stock;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } 

    }

    public void setStock(int stock) {

        if (stock >= 0) {
            this.stock = stock;
        } 
        
    }

    @Override
    public String toString() {
        return "Producto [ID: " + this.id + ", Nombre: " + this.name + ", Precio: " + this.price + ", Stock: "
                + this.stock + "]";
    }

}
