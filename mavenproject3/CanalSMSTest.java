/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.mycompany.mavenproject3.CanalSMS;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CanalSMSTest {
    @Test
    public void testEnviarNotificacionSMS() {
        CanalSMS canal = new CanalSMS();
        canal.setNumero("0987654321");
        assertTrue(canal.enviarNotificacion(), "El envío de notificación por SMS debe retornar true.");
    }
}
