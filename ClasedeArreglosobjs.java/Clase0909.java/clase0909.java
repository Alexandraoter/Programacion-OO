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

        //Arreglo de objetos

        Producto objP1 = new Producto(1, "Pizza", 1900.0);
        Producto objP2 = new Producto(2, "Perro caliente", 15000.0);
        Producto objP3 = new Producto(3, "Hamburguesa", 25000.0);
        //EL METODO TOsTRING PERMITE COLOCAR EL OBJ EN UN SYSTEM OUT PRINT Y EL PERMITE MOSTRARLO SINO LO TARERIAMOS 
        //CON EL METODO GET

        //mostramos todo el objeto
        System.out.println(objP1);
        //trae solo lo que pedi
        System.out.println(objP1.getNombre());
        //set permite modificar
        objP1.setNombre("Pizza mediana");
        //muestra el nobre que cambie
        System.out.println(objP1.getNombre());
        System.out.println(objP1);


        //SE CREA EL arreglo de objetos(producto)
        //se puede acceder a todA LA INFO QUE HAYA EN LA CLASE
        Producto[] p = new Producto[3];
        //se guardan los objetos creados en el arreglo de tipo producto
        p[0]= objP1;
        p[1]= objP2;
        p[2]= objP3;

        //CALCULAR  el precio total de todos los productos que estan dentro 
        //del arreglo con un for

        double precioTotal = 0.0;
        for(int i = 0; i < p.length; i ++){
            //porque solo neceito los precios
            precioTotal += p[i].getPrecio();
        }

        System.out.println("La factura esta por: " + precioTotal);




    }
}