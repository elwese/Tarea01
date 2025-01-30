package com.mycompany.mavenproject3;

public class Notificador implements Suscriptor{

    @Override
    public boolean enviarNotificacion() {
        System.out.println("Enviando notificación....");
        return true;
    }
    
}
