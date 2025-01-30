
import com.mycompany.mavenproject3.Estado;
import com.mycompany.mavenproject3.EstadoDisponible;
import com.mycompany.mavenproject3.TicketGeneral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicketGeneralTest {

    @Test
    public void testNotificar() {
        TicketGeneral ticket = new TicketGeneral();
        assertTrue(ticket.notificar(), "El método notificar debe retornar true.");
    }

    @Test
    public void testCambiarEstado() {
        TicketGeneral ticket = new TicketGeneral();
        Estado estado = new EstadoDisponible(); // Usa una implementación de Estado
        assertTrue(ticket.cambiarEstado(estado), "El cambio de estado debe ser exitoso.");
    }
}
