
import com.mycompany.mavenproject3.CanalBase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CanalBaseTest {
    @Test
    public void testEnviarNotificacion() {
        CanalBase canal = new CanalBase();
        assertTrue(canal.enviarNotificacion(), "El envío de notificación debe retornar true.");
    }
}
