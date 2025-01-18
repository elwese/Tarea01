
package com.mycompany.mavenproject3;


public class ReservadoFactory extends TicketFactory{
    @Override
    @Override
    public Ticket crearTicket(Estado estado, String asiento, Usuario dueño, Evento evento, String beneficios) {
        return new TicketReservado(estado, asiento, dueño, evento, beneficios);
        }
}
