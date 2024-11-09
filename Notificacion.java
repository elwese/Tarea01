import java.util.List;

public class Notificacion {
    private String descripcion;
    private String tipo;

    public boolean enviarNotificacionDifusionEvento(List<Usuario> compradores, Evento evento) {
        return true;
    }

    public boolean enviarNotificacionEstadoPago(Usuario usuario, Cobro orden) {
        return true;
    }
    
}
