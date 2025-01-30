package com.mycompany.mavenproject3;

public class MedioTarjeta extends MedioPagoBase implements MedioPago {
    public MedioTarjeta(String numeroTelf) {
        super(numeroTelf);
    }

    @Override
    public boolean realizarPago(double monto) {
        System.out.println("Pago de $" + monto + " realizado con tarjeta de crédito: " + identificador);
        return true;
    }
}
