
package com.mycompany.mavenproject3;


public class MedioTarjeta implements MedioPago{
    private String numeroTarjeta;

    public MedioTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public boolean realizarPago(double monto) {
        System.out.println("Pago de $" + monto + " realizado con tarjeta de crédito: " + numeroTarjeta);
        return true;
    }
}
