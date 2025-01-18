
package com.mycompany.mavenproject3;


public class Cobro {
    MedioPago medio;
    Suscriptor[] suscriptores;
    public MedioPago crearPago(MedioPago medio){
        this.medio = medio;
    }

     public ProcesarPago(double monto){
        medio.realizarPago(monto);
    }
}
