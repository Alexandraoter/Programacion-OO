
import java.util.ArrayList;
import java.util.Date;

public class ReservaHotel{
    private String nombre;
    private Date fechaentrada;
    private Date fechasalida;
    private int numeroHabitacion;

    public ReservaHotel(String nombre, Date fechaentrada, Date fechasalida, int numeroHabitacion){
        this.nombre = nombre;
        this.fechaentrada = fechaentrada;
        this.fechasalida = fechasalida;
        this.numeroHabitacion = numeroHabitacion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public Date getFechaEntrada() {
        return fechaentrada;
    }

    public Date getFechaSalida() {
        return fechasalida;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    // Métodos para gestionar reservas
    public static void nuevaReserva(ArrayList<ReservaHotel> reservas, ReservaHotel nuevaReserva) {
        reservas.add(nuevaReserva);
        System.out.println("Reserva creada para " + nuevaReserva.getNombre());
    }

    public static void cancelarReserva(ArrayList<ReservaHotel> reservas, ReservaHotel reserva) {
        if (reservas.remove(reserva)) {
            System.out.println("Reserva cancelada para " + reserva.getNombre());
        } else {
            System.out.println("Reserva no encontrada.");
        }
    }

    public static void consultarReserva(ArrayList<ReservaHotel> reservas, String nombre) {
        for (ReservaHotel reserva : reservas) {
            if (reserva.getNombre().equals(nombre)) {
                System.out.println("Reserva encontrada: " + reserva.getNombre() + ", Habitación: " + reserva.getNumeroHabitacion());
                return;
            }
        }
        System.out.println("Reserva no encontrada para " + nombre);
    }
}