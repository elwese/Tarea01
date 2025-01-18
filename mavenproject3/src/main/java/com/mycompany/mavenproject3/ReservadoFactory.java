
package com.mycompany.mavenproject3;


public class ReservadoFactory extends TicketFactory{
    @Override
    @Override
    public Ticket crearTicket(String asiento, Usuario dueño, Evento evento, String beneficios) {
        return new TicketReservado(asiento, dueño, evento, beneficios);
        }
}
