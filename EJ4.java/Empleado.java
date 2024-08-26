public class Empleado {
    // Atributos
    private String nombre;
    private double salarioBruto;
    private double deducciones;
    private double comision;

    // Constructor
    public Empleado(String nombre, double salarioBruto, double deducciones, double comision) {
        this.nombre = nombre;
        this.salarioBruto = salarioBruto;
        this.deducciones = deducciones;
        this.comision = comision;
    }

    // Método para calcular el salario neto
    public double calcularSalarioNeto() {
        return (salarioBruto - deducciones) + comision;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}
