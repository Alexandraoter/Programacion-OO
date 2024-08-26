public class Ejercicio4 {
    private static final double TASA_CAMBIO_DOLAR = 1 / 4026.28;  //tasa de cambio
    private static final double TASA_CAMBIO_EURO = 1 / 4497.98;  // tasa de cambio

    public static double convertirPesosADolares(double pesos) {
        return pesos * TASA_CAMBIO_DOLAR;
    }

    public static double convertirPesosAEuros(double pesos) {
        return pesos * TASA_CAMBIO_EURO;
    }

    public static void main(String[] args) {
        double pesos = 10000; 
        System.out.println("Pesos a Dólares: " + convertirPesosADolares(pesos));
        System.out.println("Pesos a Euros: " + convertirPesosAEuros(pesos));
    }
}
