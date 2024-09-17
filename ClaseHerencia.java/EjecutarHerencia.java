public class EjecutarHerencia {
    public static void main(String[] args) {
        
        //este se crea para que sepa hasta donde tiene que calcular
        final int ANIO_ACTUAL = 2024;
        //Creacion de objetos
        //el operador nwq instncia o sea le da vida al objeto
    Persona objP1 = new Estudiante("Carlos", "Campo", 2003, 258973);
    Persona objP2 = new Estudiante("Daniel", "Hernandez", 1592, 258974);

    Persona objP3 = new Profesor("Carlo", "Ancheloti", 1960, "Técnico de Futbol");
    Persona objP4 = new Profesor("Néstor", "Lorenzo", 1970, "Preparador de jugadores");   

        //mostrara la edad calculando los años que han pasado desde que nacio
    System.out.println(objP2.calcularEdad(ANIO_ACTUAL));
    System.out.println(objP3.calcularEdad(ANIO_ACTUAL));

    System.out.println(objP1.mostrarInfo());
    System.out.println(objP4.mostrarInfo());




    }
}
