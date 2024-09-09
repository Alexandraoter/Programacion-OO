import java.util.ArrayList;
import java.util.Date;
public class EjercicioFinal{
    public static void main(String[] args) {
        ArrayList<ReservaHotel> reservas = new ArrayList<>();

        
        ReservaHotel reserva1 = new ReservaHotel("Carlos", new Date(1092024), new Date(1892024), 101);
        ReservaHotel reserva2 = new ReservaHotel("Maria", new Date(1192024), new Date(1992024), 102);

        // Añadir reservas
        ReservaHotel.nuevaReserva(reservas, reserva1);
        ReservaHotel.nuevaReserva(reservas, reserva2);

        // Consultar una reserva
        ReservaHotel.consultarReserva(reservas, "Carlos");

        // Cancelar una reserva
        ReservaHotel.cancelarReserva(reservas, reserva1);

        // Consultar una reserva cancelada
        ReservaHotel.consultarReserva(reservas, "Carlos");
}
}
