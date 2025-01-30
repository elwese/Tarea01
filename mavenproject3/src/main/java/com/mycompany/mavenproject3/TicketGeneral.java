package com.mycompany.mavenproject3;

public class TicketGeneral implements Ticket{

    public TicketGeneral(Estado estado, String asiento, Usuario dueño, Evento evento, String beneficios) {
    }

    public TicketGeneral() {
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
