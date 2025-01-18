
package com.mycompany.mavenproject3;

/**
 *
 * @author Cesar
 */
public class GeneralFactory extends TicketFactory{

   @Override
    public Ticket crearTicket(String asiento, Usuario dueño, Evento evento, String beneficios) {
        return new TicketGeneral(asiento, dueño, evento, beneficios);
        }
}
