public class Tienda {
    private String nombre;
    private String direccion;
    private String telefono;
    private Producto[] productos;

    public Tienda(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.productos = new Producto[4]; // Se crea un arreglo para 4 productos
    }

    public void agregarProducto(int indice, Producto producto) {
        if (indice >= 0 && indice < productos.length) {
            productos[indice] = producto;
        } else {
            System.out.println("El índice proporcionado está fuera de rango.");
        }
    }

    public void mostrarProductos() {
        System.out.println("Productos ofrecidos por la tienda " + nombre + ":");
        for (Producto producto : productos) {
            if (producto != null) {
                System.out.println(producto);
            }
        }
    }

    public static void main(String[] args) {
        Tienda Mini_tienda = new Tienda("Mini_Tienda ", "Calle Principal Cll 100 #83-05", "313-823 4877");

        Producto producto1 = new Producto("Yogurt", "LACTEO", "19/02/2024", "ELIANA VALENTINA", 50, 4.500);
        Producto producto2 = new Producto("Carne", "CÁRNICO", "19/02/2024", "ELIANA VALENTINA", 100, 13.000);
        Producto producto3 = new Producto("Pera", "FRUTA", "19/02/2024", " PÉREZ CUBILLOS", 150, 2.000);
        Producto producto4 = new Producto("Atún", "ENLATADO", "19/02/2024", "PÉREZ CUBILLOS", 200, 3.850);

        Mini_tienda.agregarProducto(0, producto1);
        Mini_tienda.agregarProducto(1, producto2);
        Mini_tienda.agregarProducto(2, producto3);
        Mini_tienda.agregarProducto(3, producto4);

        Mini_tienda.mostrarProductos();
    }
}

class Producto {
    private String nombre;
    private String tipo;
    private String fechaExpiracion;
    private String fabricante;
    private int cantidadInventario;
    private double precioUnitario;

    public Producto(String nombre, String tipo, String fechaExpiracion, String fabricante, int cantidadInventario, double precioUnitario) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaExpiracion = fechaExpiracion;
        this.fabricante = fabricante;
        this.cantidadInventario = cantidadInventario;
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", Tipo: " + tipo +
                ", Fecha de expiración: " + fechaExpiracion +
                ", Fabricante: " + fabricante +
                ", Cantidad en inventario: " + cantidadInventario +
                ", Precio unitario: " + precioUnitario;
    }
}
