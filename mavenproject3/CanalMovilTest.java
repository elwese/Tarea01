/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.mycompany.mavenproject3.CanalMovil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CanalMovilTest {
    @Test
    public void testEnviarNotificacionMovil() {
        CanalMovil canal = new CanalMovil();
        canal.setUsusarioMobil("123456789");
        assertTrue(canal.enviarNotificacion(), "El envío de notificación móvil debe retornar true.");
    }
}
