public class Ejercicio5 {
        public static void main(String[] args) {
            // Crear un objeto de la clase Empleado
            Empleado empleado = new Empleado("Juan", 5000, 1000, 500);
    
            // Calcular el salario neto
            double salarioNeto = empleado.calcularSalarioNeto();
    
            // Imprimir el salario neto
            System.out.println("El salario neto de " + empleado.getNombre() + " es: " + salarioNeto);
        }
    
    
}
