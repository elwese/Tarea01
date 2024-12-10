
package com.mycompany.mavenproject3;


public class ReservadoFactory extends TicketFactory{
    @Override
    public Ticket crearTicket() {
        //retorna un ticket general
        return new TicketReservado();
        }
}
