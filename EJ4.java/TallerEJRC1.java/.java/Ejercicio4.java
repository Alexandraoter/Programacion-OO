public class Ejercicio4 {
    public static void main(String[] args) {
        perfume objPerfume1 = new perfume("Coconut Passion", "Victoria Secret", 150, 80.000);
        perfume objPerfume2 = new perfume("Hugo boss", "Bottled Absolu", 200, 664.677);


        objPerfume1.aplicarPerfume(50);
        objPerfume1.consultarCantidadRestante();
        objPerfume1.ajustarPrecio(200000, 150);

        objPerfume2.aplicarPerfume(75);
        objPerfume2.consultarCantidadRestante();
        objPerfume2.ajustarPrecio(670000, 200);
    }
}
