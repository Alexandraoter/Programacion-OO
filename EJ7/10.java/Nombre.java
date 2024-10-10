public class Nombre {
    private Persona persona;
    private Carga carga;

    public Nombre(Persona persona, Carga carga) {
        this.persona = persona;
        this.carga = carga;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Carga getCargo() {
        return carga;
    }

    public void setCargo(Carga cargo) {
        this.carga = cargo;
    }

    public double generarPagos() {
        return carga.pagar();
    }
}
