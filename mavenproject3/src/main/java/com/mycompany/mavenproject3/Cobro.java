
package com.mycompany.mavenproject3;


public class Cobro {
    MedioPago medio;
    Suscriptor[] suscriptores;
    public MedioPago crearPago(String medio){
        //logica de seleccion de medio
        return new MedioTarjeta();
    
    }
}
