public class Ejercicio3 {


    public static void main(String[] args){

        producto objProducto1 = new producto("Chetos", 50, 10, 1500);
        producto objProducto2 = new producto("Avena", 25, 30, 2000);
        producto objProducto3 = new producto("Chocorramo", 20, 50, 2500);
        producto objProducto4 = new producto("Bombon", 6, 15, 1000);

        objProducto1.añadirStock(20);

        
        objProducto2.reducirStock(5);

        objProducto3.añadirStock(10);

        objProducto4.reducirStock(5);

        objProducto1.calcularValorInventario();
        System.out.println("El valor total de productos que hay en el inventario es de 130");
}

}