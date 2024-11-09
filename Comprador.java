import java.util.List;

public class Comprador {
    private List<Orden> historialOrdenes;
    private Orden carrito;
    private String canalNotificacion;

    public List<Evento> buscarPorFecha(String fecha) {
        return null;
    }

    public List<Evento> buscarPorArtista(String nombre) {
        return null;
    }

    public List<Evento> buscarPorLugar(String ubicacion) {
        return null;
    }

    public List<Evento> buscarPorTipoMusica(String genero) {
        return null;
    }

    public boolean reservarTicket(int cantidad, Ticket tipoTicket, Evento evento) {
        return true;
    }

    public boolean pagarOrden() {
        return true;
    } 
}
