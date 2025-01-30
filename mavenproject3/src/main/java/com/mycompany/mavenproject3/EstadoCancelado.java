package com.mycompany.mavenproject3;

public class EstadoCancelado implements Estado{
    
    @Override
    public boolean cambiarEstado(String estado) {
        System.out.println("Ticket Cancelado: "+estado);
        return true;
        //cambia el estado
    }
    
}
