public class Camara extends Producto{
    private String marca;
    private String modelo;

    public Camara(int codigo, String nombre, String descripcion, double precio, int cantidad, String marca, String modelo) {
        super(codigo,nombre, descripcion, precio, cantidad);
        this.marca = marca;
        this.modelo = modelo;

    }

    

    public String getMarca() {
        return marca;
    }



    public void setMarca(String marca) {
        this.marca = marca;
    }



    public String getModelo() {
        return modelo;
    }



    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void mostrarDetallesCamara() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

}