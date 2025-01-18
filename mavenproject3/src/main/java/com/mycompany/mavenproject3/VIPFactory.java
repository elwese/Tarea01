
package com.mycompany.mavenproject3;


public class VIPFactory extends TicketFactory{
    @Override
    public Ticket crearTicket(String asiento, Usuario dueño, Evento evento, String beneficios) {
        return new TicketVIP(asiento, dueño, evento, beneficios);
    }
}
