

public class Foto extends Producto {
    private int resolución;
    private String formato;

    // Constructor
    
    public Foto(int numero, String nombre, String descripcion, double precio, int cantidad, int resolución,
            String formato) {
        super(numero, nombre, descripcion, precio, cantidad);
        this.resolución = resolución;
        this.formato = formato;
        
    }

    public int getResolución() {
        return resolución;
    }

    public void setResolución(int resolución) {
        this.resolución = resolución;
    }


    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }





    // Método específico para fotos
    public void mostrarDetallesFoto() {
        System.out.println("Resolución: " + resolución);
        System.out.println("Formato: " + formato);
    }
}
