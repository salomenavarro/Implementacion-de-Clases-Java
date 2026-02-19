package com.example;

/**
 * Clase que representa un Producto con validaciones de negocio.
 */
public class Product {
    private String id;
    private String name;
    private double price;
    private int stock; 

    // Constructor sin parámetros
    public Product() {
        this.id = "N/A";
        this.name = "Sin nombre";
        this.price = 0.0;
        this.stock = 0;
    }

    // Constructor con parámetros
    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        setPrice(price); // Valida el precio inicial
        setStock(stock); // Valida el stock inicial
    }

    // --- Métodos de acceso (Getters) ---
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    // --- Métodos de modificación (Setters) con validación ---
    
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }

    // Validación: Lanza excepción si el precio es negativo
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.price = price;
    }

    // Validación: Lanza excepción si el stock es negativo
    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
        this.stock = stock;
    }   

    @Override
    public String toString() {
        return "Producto [ID: " + id + ", Nombre: " + name + ", Precio: " + price + ", Stock: " + stock + "]";
    }
}
