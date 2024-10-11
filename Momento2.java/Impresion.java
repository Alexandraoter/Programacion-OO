import java.util.Date;
public class Impresion extends Producto{
    private double tamaño; // En pulgadas
    private String tipoPapel;
    private int cantidad;
    private Foto foto;

    // Constructor
    public Impresion(int codigo, String nombre, String descripcion, double precio, int cantidadEnStock, Date fechaIngreso, Foto foto, double tamaño, String tipoPapel, int cantidad) {
        super(codigo,nombre, descripcion, precio, cantidad);
        this.foto = foto;
        this.tamaño = tamaño;
        this.tipoPapel = tipoPapel;
        this.cantidad = cantidad;
    }


    public double getTamaño() {
        return tamaño;
    }



    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }



    public String getTipoPapel() {
        return tipoPapel;
    }



    public void setTipoPapel(String tipoPapel) {
        this.tipoPapel = tipoPapel;
    }



    public int getCantidad() {
        return cantidad;
    }



    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }



    
    public void mostrarDetallesImpresion() {
        System.out.println("Tamaño: " + tamaño + " pulgadas");
        System.out.println("Tipo de papel: " + tipoPapel);
        System.out.println("Cantidad: " + cantidad);
    }
}