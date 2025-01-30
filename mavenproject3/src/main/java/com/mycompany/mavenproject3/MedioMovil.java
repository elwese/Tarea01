package com.mycompany.mavenproject3;

public class MedioMovil extends MedioPagoBase implements MedioPago {
    public MedioMovil(String numeroTelf) {
        super(numeroTelf);
    }

    @Override
    public boolean realizarPago(double monto) {
        System.out.println("Pago de $" + monto + " realizado mediante pago móvil al número: " + identificador);
        return true;
    }
    
}
