
package com.mycompany.mavenproject3;


public class CanalMovil extends CanalBase{
    String ususarioMobil;
    @Override
    public boolean enviarNotificacion() {
        return true;
        //envia por canal mobil
    }
}
