public class producto {


    private String nombreProducto;
    private int codigo;
    private int cantidadStock;
    private double precio;

    public producto( String nombreProducto, int codigo, int cantidadStock, double precio){
        this.nombreProducto= nombreProducto;
        this.codigo= codigo;
        this.cantidadStock = cantidadStock;
        this.precio = precio;

    }

    public void añadirStock(int cantidad) {
        if (cantidad > 0) {
            cantidadStock += cantidad;
            System.out.println("Se han añadido " + cantidad + " unidades al stock de " + nombreProducto + ".");
        } 
    }

    public void reducirStock(int cantidad) {
            if (cantidad > 0) {
                if (cantidad <= cantidadStock) {
                    cantidadStock -= cantidad;
                    System.out.println("Se han reducido " + cantidad + " unidades del stock de " + nombreProducto + ".");
                } else {
                    System.out.println("No hay suficiente stock para reducir.");
                }
            } 
        }
    
    public double calcularValorInventario() {
            return cantidadStock * precio;
        }


    public String getNombre() {
            return nombreProducto;
        }
    
    public void setNombre(String nombre) {
            this.nombreProducto = nombre;
        }
    
    public int getCodigo() {
            return codigo;
        }
    
    public void setCodigo(int codigo) {
            this.codigo = codigo;
        }
    
    public int getCantidadStock() {
            return cantidadStock;
        }
    
    public void setCantidadStock(int cantidadStock) {
            this.cantidadStock = cantidadStock;
        }
    
    public double getPrecio() {
            return precio;
        }
    
    public void setPrecio(double precio) {
            this.precio = precio;
        }

}

