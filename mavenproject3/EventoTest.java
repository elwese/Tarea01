
import com.mycompany.mavenproject3.Evento;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EventoTest {
    @Test
    public void testEventoInicializacion() {
        Evento evento = new Evento();
        assertNull(evento.getArtista(), "El artista debe ser nulo al inicializar un evento.");
    }
}
