// Gestor de productos con herencia y polimorfismo

// Clase base (padre)
class Productos {
    // Atributos
    String nombre;
    String precio;
    String marca;
    String fechaEnQueSeHizo;
    String fechaEnQueSeVence;

    // Constructor
    public Productos(String nombre, String precio, String marca, String fechaEnQueSeHizo, String fechaEnQueSeVence) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.fechaEnQueSeHizo = fechaEnQueSeHizo;
        this.fechaEnQueSeVence = fechaEnQueSeVence;
    }

    // Método comprar
    public void comprar() {
        System.out.println("\nQue buena elección de producto para comprar!!" +
                "\nNombre: " + nombre +
                "\nPrecio: " + precio +
                "\nMarca: " + marca +
                "\nFecha en que se hizo: " + fechaEnQueSeHizo +
                "\nFecha en que se vence: " + fechaEnQueSeVence);
    }

    // Método registrar
    public void registrar() {
        System.out.println("\nProducto registrado correctamente:" +
                "\nNombre: " + nombre +
                "\nPrecio: " + precio +
                "\nMarca: " + marca +
                "\nFecha en que se hizo: " + fechaEnQueSeHizo +
                "\nFecha en que se vence: " + fechaEnQueSeVence);
    }

    // Método vender
    public void vender() {
        System.out.println("\nProducto vendido:" +
                "\nNombre: " + nombre +
                "\nPrecio: " + precio +
                "\nMarca: " + marca +
                "\nFecha en que se hizo: " + fechaEnQueSeHizo +
                "\nFecha en que se vence: " + fechaEnQueSeVence);
    }
}

// Clase hija que hereda de Productos
class ProductoAlimenticio extends Productos {
    String calorias; // Atributo nuevo de la clase hija

    // Constructor con herencia
    public ProductoAlimenticio(String nombre, String precio, String marca,
                               String fechaEnQueSeHizo, String fechaEnQueSeVence, String calorias) {
        super(nombre, precio, marca, fechaEnQueSeHizo, fechaEnQueSeVence); // Llama al constructor del padre
        this.calorias = calorias;
    }

    // Polimorfismo: redefinimos el método comprar()
    @Override
    public void comprar() {
        System.out.println("\nHas comprado un producto alimenticio:" +
                "\nNombre: " + nombre +
                "\nPrecio: " + precio +
                "\nMarca: " + marca +
                "\nCalorías: " + calorias +
                "\nFecha de fabricación: " + fechaEnQueSeHizo +
                "\nFecha de vencimiento: " + fechaEnQueSeVence);
    }
}

// Clase principal con método main
public class GestorProductos {
    public static void main(String[] args) {
        // --- Ejemplos de instancias ---
        Productos cliente1 = new Productos("Perfume", "45000", "Aromax", "10/09/2025", "10/09/2030");
        ProductoAlimenticio cliente2 = new ProductoAlimenticio("Yogurt", "2500", "Alpina", "20/10/2025", "27/10/2025", "120 kcal");
        Productos cliente3 = new Productos("Iphone", "14.500.000", "Apple", "10/08/2024", "10/08/2030");
        ProductoAlimenticio cliente4 = new ProductoAlimenticio("Leche", "15.000", "Alqueria", "10/09/2005", "10/06/2025", "120 kcal");

        // --- Ejemplo de polimorfismo ---
        // Cada cliente actúa de forma diferente dependiendo del tipo de producto
        cliente1.comprar();
        cliente2.comprar();
        cliente3.comprar();
        cliente4.comprar();
    }
}
