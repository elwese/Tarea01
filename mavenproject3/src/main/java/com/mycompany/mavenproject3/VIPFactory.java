
package com.mycompany.mavenproject3;


public class VIPFactory extends TicketFactory{
    @Override
    public Ticket crearTicket() {
        //retorna un ticket general
        return new TicketVIP();
        }
}
