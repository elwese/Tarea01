/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.mycompany.mavenproject3.CanalCorreo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CanalCorreoTest {
    @Test
    public void testEnviarNotificacionCorreo() {
        CanalCorreo canal = new CanalCorreo();
        canal.setDireccion("correo@example.com");
        assertTrue(canal.enviarNotificacion(), "El envío de notificación por correo debe retornar true.");
    }
}
