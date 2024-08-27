public class Computador {
    //Atributos de la clase 

    private String marca;
    private String color;
    private String modelo;
    private int serie;
    private double pulgadasPantalla;

    //Metodo constructor de la clase 

    public Computador(String marca, String color, String modelo, int serie, double pulgadasPantalla){
        this.marca= marca; 
        this.color= color; 
        this.modelo = modelo;
        this.serie= serie;
        this.pulgadasPantalla= pulgadasPantalla;
    }

    //Metodos de la clase
    public boolean encender(){
        return true;
    }

    public boolean apagar(){
        return false;
    }

    public void reubicar(String oficina){
        System.out.println("El computador de marca: " + marca +  " se reubicó en la oficina: " + oficina);
    }

    public void asignar(String trabajador){
        System.out.println("El computador con serie: " + serie + " Fue asignado a: " + trabajador);
    }

    public String toString(){
        return "Computador{ marca: " + marca + " color: " + color + " modelo: " + modelo + " serie: " + serie + " pulgadas: " + pulgadasPantalla + "}";

    }
}