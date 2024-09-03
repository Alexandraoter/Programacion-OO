public class Ejercicio2 {
    public static void main(String[] args) {
        // Crear objetos de la clase Libro
        Libro libro1 = new Libro("Romper el circulo", "Collen Hoover", "978-03078", 377);
        Libro libro2 = new Libro("Love you", "Estelle Maskame", "978-24935", 512);

        // Simular el proceso de préstamo y devolución
        System.out.println("Estado inicial:");
        System.out.println("'" + libro1.getTitulo() + "' disponible: " + libro1.estaDisponible());
        System.out.println("'" + libro2.getTitulo() + "' disponible: " + libro2.estaDisponible());

        System.out.println("\nRomper el circulo':");
        libro1.prestar();

        System.out.println("\nIntentando prestar 'Romper el circulo' nuevamente:");
        libro1.prestar();

        System.out.println("\nEstado después del primer préstamo:");
        System.out.println("'" + libro1.getTitulo() + "' disponible: " + libro1.estaDisponible());

        System.out.println("\nDevolviendo 'Romper el circulo':");
        libro1.devolver();

        System.out.println("\nEstado después de la devolución:");
        System.out.println("'" + libro1.getTitulo() + "' disponible: " + libro1.estaDisponible());

        System.out.println("\nIntentando devolver 'Romper el circulo' nuevamente:");
        libro1.devolver();

        System.out.println("\nEstado final:");
        System.out.println("'" + libro1.getTitulo() + "' disponible: " + libro1.estaDisponible());
        System.out.println("'" + libro2.getTitulo() + "' disponible: " + libro2.estaDisponible());
    }
}
