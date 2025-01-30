package com.mycompany.mavenproject3;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private List<Horario> horarios;
    private String artista;
    private List<Ubicacion> ubicaciones;
    private List<Ticket> tickets;

    public Evento(String artista) {
        this.artista = artista;
        this.horarios = new ArrayList<>();
        this.ubicaciones = new ArrayList<>();
        this.tickets = new ArrayList<>();
    }

    public Evento() {
    }

    public void agregarHorario(Horario horario) {
        horarios.add(horario);
    }

    public void agregarUbicacion(Ubicacion ubicacion) {
        ubicaciones.add(ubicacion);
    }

    public void agregarTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public List<Horario> getHorarios() { return horarios; }
    public String getArtista() { return artista; }
    public List<Ubicacion> getUbicaciones() { return ubicaciones; }
    public List<Ticket> getTickets() { return tickets; }

}

