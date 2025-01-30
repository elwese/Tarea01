package com.mycompany.mavenproject3;

public class Cobro {
    private MedioPago medio;
    private Suscriptor[] suscriptores;
    
    public boolean crearPago(MedioPago medio){
        this.medio = medio;
        return true;
    }

     public boolean procesarPago(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo");
        }
        return medio.realizarPago(monto);
    }

    public MedioPago getMedio() {
        return medio;
    }

    public void setMedio(MedioPago medio) {
        this.medio = medio;
    }

}
