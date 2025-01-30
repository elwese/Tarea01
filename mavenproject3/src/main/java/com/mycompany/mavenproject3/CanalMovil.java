package com.mycompany.mavenproject3;

public class CanalMovil extends CanalBase{
    private String ususarioMobil;
    
    @Override
    public boolean enviarNotificacion() {
        System.out.println("Enviando notificación por el móvil....");
        return true;
        //envia por canal mobil
    }

    public String getUsusarioMobil() {
        return ususarioMobil;
    }

    public void setUsusarioMobil(String ususarioMobil) {
        this.ususarioMobil = ususarioMobil;
    }
    
}
