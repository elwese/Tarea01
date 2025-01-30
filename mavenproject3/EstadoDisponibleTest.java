
import com.mycompany.mavenproject3.EstadoDisponible;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstadoDisponibleTest {
    @Test
    public void testCambiarEstado() {
        EstadoDisponible estado = new EstadoDisponible();
        assertTrue(estado.cambiarEstado("Disponible"), "El cambio de estado debe ser exitoso.");
    }
}
