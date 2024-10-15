import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        ArrayList<Producto> productos = Producto.crearListaProductos();

        // Crear un cliente
        Cliente cliente = new Cliente(1, "Carlos", "Mera", "Calle 123");

        // Crear un pedido con detalles
        Pedido pedido = new Pedido(1001, cliente);
        pedido.agregarDetalle(new DetallePedido(productos.get(0), 2));
        pedido.agregarDetalle(new DetallePedido(productos.get(1), 1));

        // Mostrar información del pedido
        System.out.println("Detalles del Pedido:");
        System.out.println("Número de Pedido: " + pedido.getNumeroPedido());
        System.out.println("Cliente: " + cliente.getNombre()); 
        pedido.mostrarDetalles();

        
        double total = pedido.calcularTotal();
        System.out.println("El total del pedido es: $" + total);
        System.out.println("Gracias por su compra");
    }
}