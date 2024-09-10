import java.util.*;
public class clase0909 {
    public static void main(String[] args){

        //opcion1 creacion de arreglo de enteros definidos
        int [] a = {6, 20, 31, 16};
        //siempre se recorre con un for
        for(int i = 0; i < a.length; i++){
            System.out.println("a["+ i + "] = " + a[i]);
        }
        
        //opcion2 creacion del arreglo con valores aleatorios

        int[] b = new int[4];
        //craear atraves de un for numeros aleatorios usando la libreria Random
        Random r = new Random();
        for(int i =0; i < b.length; i ++){
            b[i] = r.nextInt(20) + 1;
            //para no hacer otro for sino mostrar de un vez los elementos del arreglo
            System.out.println("b["+ i + "] = " + b[i]);
        }


    }
}