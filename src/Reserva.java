import java.util.Date;

public class Reserva {
    String reserva;
    Date fechaemision;
    Trayecto trayecto;

    public Reserva(String reserva, Date fechaemision, Trayecto trayecto) {
        this.reserva = reserva;
        this.fechaemision = fechaemision;
        this.trayecto = trayecto;
    }
}
