
import com.mycompany.mavenproject3.EstadoReservado;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstadoReservadoTest {
    @Test
    public void testCambiarEstado() {
        EstadoReservado estado = new EstadoReservado();
        assertTrue(estado.cambiarEstado("Reservado"), "El cambio de estado debe ser exitoso.");
    }
}
