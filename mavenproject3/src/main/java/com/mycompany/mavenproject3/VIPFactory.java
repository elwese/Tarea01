
package com.mycompany.mavenproject3;


public class VIPFactory extends TicketFactory{
    @Override
    public Ticket crearTicket(Estado estado, String asiento, Usuario dueño, Evento evento, String beneficios) {
        return new TicketVIP(estado, asiento, dueño, evento, beneficios);
    }
}
