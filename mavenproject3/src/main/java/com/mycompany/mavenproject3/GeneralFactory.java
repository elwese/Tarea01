
package com.mycompany.mavenproject3;

/**
 *
 * @author Cesar
 */
public class GeneralFactory extends TicketFactory{

    @Override
    public Ticket crearTicket() {
        //retorna un ticket general
        return new TicketGeneral();
        }
}
