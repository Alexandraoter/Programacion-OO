public class Operario extends Carga {
    private int horas;
    private double tarifaHora;

    public Operario(int horas, double tarifaHora) {
        this.horas = horas;
        this.tarifaHora = tarifaHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double pagar() {
        return tarifaHora * horas;
    }
}
