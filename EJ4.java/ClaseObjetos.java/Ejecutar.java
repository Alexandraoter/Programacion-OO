public class Ejecutar {

    public static void main(String[] args){
        //DOS FORMAS DE HACER 

        //primer objeto en dos lineas
        Computador objComputador1;
        objComputador1 = new Computador("HP", "Negro", "MLX738", 6412148, 21.0);

        //segundo objeto en una linea 
        Computador objComputador2 = new Computador("Lenovo", "Gris", "LBV258", 1258822, 15.0);

        System.out.println(objComputador1.toString());
    }
}