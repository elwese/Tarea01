
import com.mycompany.mavenproject3.MedioTransferencia;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MedioTransferenciaTest {
    @Test
    public void testRealizarPago() {
        MedioTransferencia medio = new MedioTransferencia("1234567890");
        assertTrue(medio.realizarPago(150.0), "El pago debe ser exitoso.");
    }
}
