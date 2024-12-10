
package com.mycompany.mavenproject3;

public class MedioTransferencia implements MedioPago{
    String numeroCuenta;
    @Override
    public boolean realizarPago() {
        return true;
    }
    
}
