public class perfume {

    private String nombre;
    private String marca;
    private double capacidad;
    private double precio;
    
    public perfume( String nombre, String marca, double capacidad, double precio){
        this.nombre = nombre;
        this.marca = marca;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public void aplicarPerfume(double cantidad){
        if (cantidad <= capacidad){
            capacidad-= cantidad;
        }else{
            System.out.println("No hay suficiente perfume para aplicar");
        }
    }

    public void consultarCantidadRestante(){
        System.out.print("La cantidad restante en el perfume " + nombre + "es de " + capacidad + ".");
    }

    public void ajustarPrecio(double nuevoPrecio, double cantidad){
        if (cantidad <= precio){
            precio = nuevoPrecio;
        }else{
            System.out.println(" Se ha actualizado el precio de " + nombre + " ahora es: " + nuevoPrecio + ".");
        }
    }
}
