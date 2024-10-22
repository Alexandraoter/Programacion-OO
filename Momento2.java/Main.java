import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente = new Cliente(1, "Andres", "Gonzales", "Calle 5ta");

        // Crear objetos de Camara e Impresion
        Camara camara1 = new Camara(1, "Camara", "Digital con lente", 450000, 2, "Canon", "EOS 90D");
        Foto foto1 = new Foto(1, "Foto de paisaje", "Hermosa foto de un paisaje", 5000, 10, 1080, "JPEG");
        Impresion impresion1 = new Impresion(2, "Impresión de foto", "Impresión en alta calidad", 30000, 5, new Date(), foto1, 8.5, "Satinado", 100);

        // Mostrar detalles de los objetos creados
        System.out.println("Detalles del Pedido:");
        System.out.println("Cliente: " + cliente.getNombre());
        
        camara1.mostrarInformacion();
        impresion1.mostrarDetallesImpresion();

        // Calcular total del pedido
        double total = camara1.getPrecio() * camara1.getCantidad() + impresion1.getPrecio() * impresion1.getCantidad();
        System.out.println("El total del pedido es: $" + total);
        System.out.println("Gracias por su compra");
    }
}