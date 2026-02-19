package com.example;

/**
 * Clase de demostración para la gestión de productos.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE PRODUCTOS ===");

        try {
            // 1. Creación con constructor por defecto
            Product producto1 = new Product(); 
            producto1.setId("P34");
            producto1.setName("Laptop Gaming");
            producto1.setPrice(1000.0);
            
            // 2. Creación con constructor parametrizado
            Product producto2 = new Product("P123", "Smartphone", 800.0, 25);

            // 3. Demostración de Getters
            System.out.println("\n--- Consulta Individual (Getters) ---");
            System.out.println("Producto 1: " + producto1.getName() + " ($" + producto1.getPrice() + ")");
            System.out.println("Producto 2: " + producto2.getName() + " (" + producto2.getStock() + " unidades)");

            // 4. Demostración de toString
            System.out.println("\n--- Listado Completo (toString) ---");
            System.out.println(producto1);
            System.out.println(producto2);

            // 5. Prueba de validación (Esto lanzará la excepción solicitada)
            System.out.println("\n--- Intento de asignar precio negativo ---");
            producto1.setPrice(-50.0);

        } catch (IllegalArgumentException e) {
            System.err.println("CAPTURA DE ERROR: " + e.getMessage());
        }

        System.out.println("\nPrograma finalizado correctamente.");
    }
}
