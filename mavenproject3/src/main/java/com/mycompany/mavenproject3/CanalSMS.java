package com.mycompany.mavenproject3;

public class CanalSMS extends CanalBase{
    private String numero;
    @Override
    public boolean enviarNotificacion() {
        System.out.println("Enviando notificacion por SMS");
        return true;
        //envia por sms
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}
