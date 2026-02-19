package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Demostración de Gestión de Productos ---");

            Product producto1 = new Product(); 
            Product producto2 = new Product("P123", "Laptop", 1200.0, 50);

            producto1.setId("P34");
            producto1.setName("Laptop Gaming");
            producto1.setPrice(1000.0);
            
            System.out.println("Caracteristicas (Getter):");
            System.out.println("Producto 1 - Nombre: " + producto1.getName() + " | Precio: " + producto1.getPrice());
            System.out.println("Producto 2 - ID: " + producto2.getId() + " | Stock: " + producto2.getStock());

            System.out.println("\nCaracteristicas (toString):");
            System.out.println(producto1.toString());
            System.out.println(producto2.toString());

    }
}