package com.mycompany.mavenproject3;

public class MedioTransferencia extends MedioPagoBase implements MedioPago {
    public MedioTransferencia(String numeroTelf) {
        super(numeroTelf);
    }

    @Override
    public boolean realizarPago(double monto) {
        System.out.println("Pago de $" + monto + " realizado mediante transferencia bancaria: " + identificador);
        return true;
    }
    
}
