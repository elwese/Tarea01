
import com.mycompany.mavenproject3.Administrador;
import com.mycompany.mavenproject3.Evento;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdministradorTest {
    @Test
    public void testCrearEvento() {
        Administrador admin = new Administrador();
        Evento evento = admin.crearEvento("Shakira");
        assertNotNull(evento, "El evento creado no debe ser nulo.");
    }
}
