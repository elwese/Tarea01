
package com.mycompany.mavenproject3;


public class CanalCorreo extends CanalBase{
    String direccion;
    
    @Override
    public boolean enviarNotificacion() {
        //enviar por correo
        return true;
    }
}
