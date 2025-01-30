package com.mycompany.mavenproject3;

public class GestorReservas {
    public boolean reservarTicket(Cliente cliente, Ticket ticket) {
        if (ticket != null) {
            cliente.agregarTicket(ticket);
            System.out.println("Ticket reservado exitosamente para " + cliente.getUsuario());
            return true;
        }
        return false;
    }
}
