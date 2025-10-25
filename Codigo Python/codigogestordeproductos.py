# Gestor de productos con herencia y polimorfismo

class Productos:
    def __init__(self, nombre, precio, marca, fechaenquesehizo, fechaenquesevence):
        self.nombre = nombre
        self.precio = precio
        self.marca = marca
        self.fechaenquesehizo = fechaenquesehizo
        self.fechaenquesevence = fechaenquesevence

    def comprar(self):
        print(f"""
Que buena elección de producto para comprar!!
Nombre: {self.nombre}
Precio: {self.precio}
Marca: {self.marca}
Fecha en que se hizo: {self.fechaenquesehizo}
Fecha en que se vence: {self.fechaenquesevence}
        """)

    def registrar(self):
        print(f"""
Producto registrado correctamente:
Nombre: {self.nombre}
Precio: {self.precio}
Marca: {self.marca}
Fecha en que se hizo: {self.fechaenquesehizo}
Fecha en que se vence: {self.fechaenquesevence}
        """)

    def vender(self):
        print(f"""
Producto vendido:
Nombre: {self.nombre}
Precio: {self.precio}
Marca: {self.marca}
Fecha en que se hizo: {self.fechaenquesehizo}
Fecha en que se vence: {self.fechaenquesevence}
        """)


# Clase hija que hereda de Productos
class ProductoAlimenticio(Productos):
    def __init__(self, nombre, precio, marca, fechaenquesehizo, fechaenquesevence, calorias):
        # Heredamos atributos del padre
        super().__init__(nombre, precio, marca, fechaenquesehizo, fechaenquesevence) # Super permite reutilizar el código de la clase padre sin volver a escribirlo.
        self.calorias = calorias  # Atributo nuevo de la clase hija

    # Polimorfismo: redefinimos el método comprar()
    def comprar(self):
        print(f"""
Has comprado un producto alimenticio:
Nombre: {self.nombre}
Precio: {self.precio}
Marca: {self.marca}
Calorías: {self.calorias}
Fecha de fabricación: {self.fechaenquesehizo}
Fecha de vencimiento: {self.fechaenquesevence}
        """)


# --- Ejemplos de instancias ---
cliente1 = Productos("Perfume", "45000", "Aromax", "10/09/2025", "10/09/2030")
cliente2 = ProductoAlimenticio("Yogurt", "2500", "Alpina", "20/10/2025", "27/10/2025", "120 kcal")
cliente3 = Productos("Iphone", "14.500.000","Apple","10/08/2024","10/08/2030")
cliente4 = ProductoAlimenticio("Leche","15.000","Alqueria","10/09/2005","10/06/2025","120 kcal")

# --- Ejemplo de polimorfismo --- 
# Cada cliente actua de diferente forma dependiendo del producto que compro; Si es alimenticio o si es un producto electronico
cliente1.comprar()
cliente2.comprar()
cliente3.comprar()
cliente4.comprar()