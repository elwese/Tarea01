
package com.mycompany.mavenproject3;


public class MedioMovil implements MedioPago{
    private String numeroTelf;

    public MedioMovil(String numeroTelf) {
        this.numeroTelf = numeroTelf;
    }

    @Override
    public boolean realizarPago(double monto) {
        System.out.println("Pago de $" + monto + " realizado mediante pago móvil al número: " + numeroTelf);
        return true;
    }
    
}
