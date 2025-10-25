// Gestor de productos con herencia y polimorfismo
// Clase padre: Productos
class Productos {
    // Atributos comunes a todos los productos
    String nombre;
    String precio;
    String marca;
    String fechaHecho;
    String fechaVence;

    // Constructor: inicializa los atributos de la clase
    public Productos(String nombre, String precio, String marca, String fechaHecho, String fechaVence) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.fechaHecho = fechaHecho;
        this.fechaVence = fechaVence;
    }

    // Método comprar(): muestra los datos del producto general
    public void comprar() {
        System.out.println("\n¡Qué buena elección de producto para comprar!");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Marca: " + marca);
        System.out.println("Fecha en que se hizo: " + fechaHecho);
        System.out.println("Fecha en que se vence: " + fechaVence);
    }
}

// Clase hija: ProductoAlimenticio (hereda de Productos)
class ProductoAlimenticio extends Productos {
    // Atributo adicional exclusivo para productos alimenticios
    String calorias;

    // Constructor de la clase hija
    // Usa 'super' para llamar al constructor de la clase padre
    public ProductoAlimenticio(String nombre, String precio, String marca, String fechaHecho, String fechaVence, String calorias) {
        super(nombre, precio, marca, fechaHecho, fechaVence);
        this.calorias = calorias;
    }

    // Polimorfismo: se redefine el método comprar()
    @Override
    public void comprar() {
        System.out.println("\nHas comprado un producto alimenticio:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Marca: " + marca);
        System.out.println("Calorías: " + calorias);
        System.out.println("Fecha de fabricación: " + fechaHecho);
        System.out.println("Fecha de vencimiento: " + fechaVence);
    }
}

// Clase principal que ejecuta el programa
public class Main {
    public static void main(String[] args) {
        // Creación de objetos de diferentes tipos
        Productos cliente1 = new Productos("Perfume", "45000", "Aromax", "10/09/2025", "10/09/2030");
        ProductoAlimenticio cliente2 = new ProductoAlimenticio("Yogurt", "2500", "Alpina", "20/10/2025", "27/10/2025", "120 kcal");
        Productos cliente3 = new Productos("Iphone", "14.500.000", "Apple", "10/08/2024", "10/08/2030");
        ProductoAlimenticio cliente4 = new ProductoAlimenticio("Leche", "15.000", "Alqueria", "10/09/2005", "10/06/2025", "120 kcal");

        // Polimorfismo:
        // Aunque todos los objetos usan el método comprar(),
        // cada uno muestra un comportamiento distinto según su tipo.
        cliente1.comprar(); // Usa el método de Productos
        cliente2.comprar(); // Usa el método redefinido en ProductoAlimenticio
        cliente3.comprar(); // Usa el método de Productos
        cliente4.comprar(); // Usa el método redefinido en ProductoAlimenticio
    }
}
