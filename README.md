# Actividad 3 - Implementación de Clases Java

### Datos del aprendiz
* **Nombre:** Salome Navarro Pineda
* **Ficha:** 3223874
* **Programa:** Análisis y Desarrollo de Software
* **Materia:** Programación en Java

---

## Descripción del Proyecto
Este proyecto es una aplicación de consola en Java que demuestra los conceptos fundamentales de la **Programación Orientada a Objetos (POO)**. 

El sistema gestiona una clase `Product` que implementa:
* **Encapsulamiento:** Atributos privados con métodos Getter y Setter.
* **Constructores:** Uso de constructor por defecto (con inicialización segura) y parametrizado.
* **Manejo de Excepciones:** Validación de datos en los métodos Setter mediante el lanzamiento de `IllegalArgumentException` para evitar valores negativos en precio y stock.
* **Sobreescritura:** Implementación del método `toString()` para una representación clara de los objetos.

---

## Instrucciones de Compilación y Ejecución

Para asegurar que el proyecto compile y resuelva correctamente las dependencias entre clases (evitando errores de resolución de símbolos), sigue estas instrucciones desde la **raíz del proyecto**:

### 1. Compilación
Abre una terminal y ejecuta el siguiente comando para compilar todas las clases dentro de su estructura de paquetes:
```bash
javac -d . src/main/java/com/example/*.java

### 2. Compilación

Una vez compilado, ejecuta el programa llamando a la clase principal por su nombre de paquete completo:

java com.example.Main

---

## Salida Esperada del Programa

Al ejecutar la aplicación, el resultado en consola será:

--- Demostración de Gestión de Productos ---
Caracteristicas (Getter):
Producto 1 - Nombre: Laptop Gaming | Precio: 1000.0
Producto 2 - ID: P123 | Stock: 50

Caracteristicas (toString):
Producto [ID: P34, Nombre: Laptop Gaming, Precio: 1000.0, Stock: 0]
Producto [ID: P123, Nombre: Laptop, Precio: 1200.0, Stock: 50]

