
package com.mycompany.mavenproject3;

/**
 *
 * @author Cesar
 */
public class GeneralFactory extends TicketFactory{

   @Override
    public Ticket crearTicket(Estado estado, String asiento, Usuario dueño, Evento evento, String beneficios) {
        return new TicketGeneral(estado, asiento, dueño, evento, beneficios);
        }
}
