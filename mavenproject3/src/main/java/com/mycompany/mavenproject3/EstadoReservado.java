package com.mycompany.mavenproject3;

public class EstadoReservado implements Estado{

    @Override
    public boolean cambiarEstado(String estado) {
        System.out.println("Ticket: "+estado);
        return true;
        //cambia el estado
    }
    
}
