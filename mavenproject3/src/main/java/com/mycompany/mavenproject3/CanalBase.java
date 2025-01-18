
package com.mycompany.mavenproject3;

public class CanalBase extends Notificador{
    Notificador base;
    @Override
    public boolean enviarNotificacion() {
        return true;
    }
}
