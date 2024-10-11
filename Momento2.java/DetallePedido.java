public class DetallePedido {
    private Producto producto;
    private int cantidad;

    // Constructor
    public DetallePedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // Método para obtener el subtotal
    public double getSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    // Método para mostrar la información del detalle
    public void mostrarInformacion() {
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + getSubtotal());
    }
}
