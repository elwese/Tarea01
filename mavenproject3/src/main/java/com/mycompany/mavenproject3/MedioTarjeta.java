
package com.mycompany.mavenproject3;


public class MedioTarjeta implements MedioPago{
    String numeroTarjeta;
    @Override
    public boolean realizarPago(){
        return true;
    }
}
