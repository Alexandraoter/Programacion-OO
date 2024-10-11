import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear una foto
        Foto foto = new Foto(201, "Foto de paisaje", "Foto de alta resolución", 50.00, 5, 1080, "JPEG");

        // Crear una impresión a partir de la foto
        Impresion impresionEnmarcada = new Impresion(2, "Impresión enmarcada", "Paisaje en marco", 30.99, 5, new Date(), foto, 11, "Fotográfico", 10);

        // Crear un cliente
        Cliente cliente = new Cliente(25, "Carlos", "Campo", "Carrera Ac1");

        // Crear una lista de detalles de pedido
        ArrayList<DetallePedido> detalles = new ArrayList<>();

        // Crear un pedido
        Pedido pedido = new Pedido(1, "Juan", "Pérez", "Calle Falsa 123", "123456789", "juan@example.com", 1001, cliente, detalles);

        // Agregar la impresión al pedido
        DetallePedido detalleImpresion = new DetallePedido(impresionEnmarcada, 2);
        pedido.agregarDetalle(detalleImpresion);

        // Mostrar información del pedido
        System.out.println("Detalles del pedido:");
        pedido.mostrarDetalles();
    }
}

