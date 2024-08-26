public class Ejercici6 {
    private static final double VALOR_HORA = 2000;
    private static final double IVA = 0.20;

    public static double calcularPago(int horas) {
        double subtotal = horas * VALOR_HORA;
        double totalIVA = subtotal * IVA;
        return subtotal + totalIVA;
    }

    public static void main(String[] args) {
        int horas = 5; // Ej cantidad horas
        System.out.println("Pago total por " + horas + " horas: " + calcularPago(horas));
    }
}
