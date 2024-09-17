//se debe poner el extends para saber de donde trae la informacion
public class Estudiante extends Persona {
    
    private int ID;

    //se ponene los atriutos de la clase padre
    public Estudiante(String nombre, String apellido, int anioNacimiento, int iD) {
        super(nombre, apellido, anioNacimiento);
        this.ID = iD;
    }

    public int getID() {
        return ID;
    }

    public String mostrarInfo(){
        return "Estudiante: [ nombre Completo: " + getNombre() + " "
                + getApellido() + " Año de Nacimiento: " + getAnioNacimiento()
                + " id: " + ID + "]";
    }
}
