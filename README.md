# Actividad 3 - Implementación de Clases Java

### Datos del aprendiz
* **Nombre:** Salome Navarro Pineda
* **Ficha:** 3223874
* **Programa:** Análisis y Desarrollo de Software
* **Materia:** Programación en Java

---

## Descripción del Proyecto
Este proyecto es una aplicación de consola en Java que demuestra los conceptos fundamentales de la **Programación Orientada a Objetos (POO)**. 

El sistema gestiona una clase `Product` que incluye:
* **Encapsulamiento:** Atributos privados con métodos Getter y Setter.
* **Constructores:** Uso de constructor por defecto y parametrizado.
* **Validación:** Control básico en los métodos Setter para evitar valores negativos en precio y stock.
* **Sobreescritura:** Implementación del método `toString()` para representar los objetos como texto.

---

## Instrucciones de Compilación y Ejecución

Para ejecutar este proyecto, asegúrate de tener instalado el **JDK (Java Development Kit)**.

1. **Estructura de carpetas:**
   Asegúrate de que tus archivos estén dentro de la carpeta correspondiente al paquete:
   `com/example/Main.java`
   `com/example/Product.java`

2. **Compilación:**
   Abre una terminal en la raíz del proyecto y ejecuta:
   ```bash
   javac com/example/*.java


## Salida Esperada del Programa

Demostración
Caracteristicas De Los Productos(Getter)
Producto 1 - Nombre: Laptop Gaming | Precio: 1000.0
Producto 2 - ID: P123 | Stock: 50
Caracteristicas De Los Productos(toString)
Producto [ID: P34, Nombre: Laptop Gaming, Precio: 1000.0, Stock: 0]
Producto [ID: P123, Nombre: Laptop, Precio: 1200.0, Stock: 50]