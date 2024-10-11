import java.util.ArrayList;


public class Pedido extends Cliente{
    private int numeroPedido;
    private Cliente cliente;
    
    private ArrayList<DetallePedido> detalles; // Lista de detalles de los productos del pedido

    // Constructor
    
    public Pedido(int id, String nombre, String apellido, String direccion, String telefono, String email,
            int numeroPedido, Cliente cliente, ArrayList<DetallePedido> detalles) {
        super(id, nombre, apellido, direccion);
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.detalles = detalles;
    }

    

    

    public int getNumeroPedido() {
        return numeroPedido;
    }





    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }





    public Cliente getCliente() {
        return cliente;
    }





    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }




    public ArrayList<DetallePedido> getDetalles() {
        return detalles;
    }





    public void setDetalles(ArrayList<DetallePedido> detalles) {
        this.detalles = detalles;
    }





    // Métodos adicionales
    public void agregarDetalle(DetallePedido detalle) {
        detalles.add(detalle);
    }

    public double calcularTotal() {
        double total = 0;
        for (DetallePedido detalle : detalles) {
            total += detalle.getSubtotal();
        }
        return total;
    }

    public void mostrarDetalles() {
        System.out.println("Excelente estado");
        for (DetallePedido detalle : detalles) {
            detalle.mostrarInformacion();
        }
        System.out.println("Total del pedido: $" + calcularTotal());
    }
}
