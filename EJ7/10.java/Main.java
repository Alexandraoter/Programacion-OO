public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", "Perez", 30, "Calle 5ta");
        Carga c1 = new Consultor(2000, 5.0);
        Nombre n1 = new Nombre(p1, c1);

        Persona p2 = new Persona("Ana", "Gomez", 25, "Avenida Ciudad de Cali");
        Carga c2 = new Operario(10, 30);
        Nombre n2 = new Nombre(p2, c2);

        System.out.println(p1.getNombre() + " " + p1.getApellido() + " - Pago: " + n1.generarPagos());
        System.out.println(p2.getNombre() + " " + p2.getApellido() + " - Pago: " + n2.generarPagos());
    }
}
