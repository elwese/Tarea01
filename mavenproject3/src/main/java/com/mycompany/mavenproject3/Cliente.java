package com.mycompany.mavenproject3;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario{
    private List<Ticket> ticketsReservados;

    public Cliente(String nombre, String apellido, String usuario, String contraseña) {
        super(nombre, apellido, usuario, contraseña);
        this.ticketsReservados = new ArrayList<>();
    }

    public Cliente() {
    }
    
    public List<Ticket> getTicketsReservados() {
        return ticketsReservados;
    }

    public void agregarTicket(Ticket ticket) {
        ticketsReservados.add(ticket);
    }
    
}
