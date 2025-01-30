/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jeremy
 */
import com.mycompany.mavenproject3.Cobro;
import com.mycompany.mavenproject3.MedioMovil;
import com.mycompany.mavenproject3.MedioPago;
import com.mycompany.mavenproject3.MedioTransferencia;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CobroTest {
    @Test
    public void testCrearPago() {
        Cobro cobro = new Cobro();
        MedioPago medio = new MedioTransferencia("123456");
        cobro.crearPago(medio);
        assertNotNull(cobro.getMedio(), "El medio de pago no debe ser nulo.");
    }

    @Test
    public void testProcesarPago() {
        Cobro cobro = new Cobro();
        MedioPago medio = new MedioMovil("0987654321");
        cobro.crearPago(medio);
        assertDoesNotThrow(() -> cobro.procesarPago(100.0), "El procesamiento del pago no debe lanzar excepciones.");
    }
}
