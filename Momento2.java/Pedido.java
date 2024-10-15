import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private Cliente cliente;
    private List<DetallePedido> detalles = new ArrayList<>();

    public Pedido(int numeroPedido, Cliente cliente) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
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



    public List<DetallePedido> getDetalles() {
        return detalles;
    }



    public void setDetalles(List<DetallePedido> detalles) {
        this.detalles = detalles;
    }

    


    public void agregarDetalle(DetallePedido detalle) {
        List<DetallePedido> copiaDetalles = new ArrayList<>(detalles);
        copiaDetalles.add(detalle);
        this.detalles = copiaDetalles;
    }

    public void mostrarDetalles() {
        System.out.println("Las frutas estan en perfecto estado");
        for (DetallePedido detalle : detalles) {
        detalle.mostrarInformacion();
    }       
}

    public double calcularTotal() {
        double total = 0;
        for (DetallePedido detalle : detalles) {
            total += detalle.getSubtotal();
    }
            return total;
}

}