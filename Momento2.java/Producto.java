import java.util.ArrayList;

public class Producto {
    private int numero;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidad;

    public Producto(int numero, String nombre, String descripcion, double precio, int cantidad) {
        this.numero = numero;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    

    public int getNumero() {
        return numero;
    }



    public void setNumero(int numero) {
        this.numero = numero;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getDescripcion() {
        return descripcion;
    }



    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    public double getPrecio() {
        return precio;
    }



    public void setPrecio(double precio) {
        this.precio = precio;
    }



    public int getCantidad() {
        return cantidad;
    }



    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }



    // Método para mostrar la información del producto
    public void mostrarInformacion() {
        System.out.println("Número: " + numero);
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad en stock: " + cantidad);
    }

    // Método estático para crear un ArrayList de productos
    public static ArrayList<Producto> crearListaProductos() {
        ArrayList<Producto> productos = new ArrayList<>();
        // Agregar productos a la lista
        productos.add(new Producto(1, "Pera", "Fruta verde y pequeña", 1500, 190));
        productos.add(new Producto(2, "piña", "Fruta amarilla", 4500, 280));
        
        return productos;
    }
}
