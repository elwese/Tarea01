import java.util.List;

public class Organizador {
    private String cedula;
    private String compañia;
    private List<Evento> eventosHechos;

    public boolean definirPoliticasDevolucion(String descripcion, int porcentajeDevolver) {
        return true;
    }

    public boolean definirPoliticaCambio(String descripcion, int diasPlazo) {
        return true;
    }

    public boolean definirRestricciones(Ticket tipoTicket, int cantidad) {
        return true;
    }

    public boolean enviarMensajeEvento(Evento evento, String descripcion) {
        return true;
    }

    public boolean cancelarEvento(Evento evento, String motivo) {
        return true;
    }

    public boolean cambioFechaEvento(Evento evento, String fecha, String motivo) {
        return true;
    } 
}
