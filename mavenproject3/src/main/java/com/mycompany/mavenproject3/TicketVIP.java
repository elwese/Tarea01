package com.mycompany.mavenproject3;

public class TicketVIP implements Ticket{

    public TicketVIP(Estado estado, String asiento, Usuario dueño, Evento evento, String beneficios) {        
    }

    @Override
    public boolean notificar() {
        return true;
        //notifica
    }

    @Override
    public boolean cambiarEstado(Estado estado) {
        System.out.println("El ticket a cambiado a estado: "+ estado);
        return true;
        //cambia estado
    }
    
}
