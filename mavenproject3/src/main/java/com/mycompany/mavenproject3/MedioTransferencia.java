
package com.mycompany.mavenproject3;

public class MedioTransferencia implements MedioPago{
    private String numeroCuenta;

    public MedioTransferencia(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public boolean realizarPago(double monto) {
        System.out.println("Pago de $" + monto + " realizado mediante transferencia bancaria: " + numeroCuenta);
        return true;
    }
    
}
