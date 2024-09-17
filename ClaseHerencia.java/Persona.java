public class Persona {
    
    private String nombre;
    private String apellido;
    private int anioNacimiento;

    public Persona(String nombre, String apellido, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioNacimiento = anioNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int calcularEdad( int anioActual){
        return anioActual -  anioNacimiento;

    }

    public String mostrarInfo(){
        return "";
    }

    



}