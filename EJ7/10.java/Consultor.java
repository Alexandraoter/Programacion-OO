public class Consultor extends Carga {
    private double venta;
    private double comision;

    public Consultor(double venta, double comision) {
        this.venta = venta;
        this.comision = comision;
    }

    public double getVenta() {
        return venta;
    }

    public void setVenta(double venta) {
        this.venta = venta;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public double pagar() {
        return comision * venta;
    }
}
