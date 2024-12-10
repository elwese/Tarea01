
package com.mycompany.mavenproject3;


public class MedioMovil implements MedioPago{
    String numeroTelf;
    @Override
    public boolean realizarPago() {
        return true;
    }
    
}
