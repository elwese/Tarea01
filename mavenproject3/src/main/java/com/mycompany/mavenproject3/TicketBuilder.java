package com.mycompany.mavenproject3;

public class TicketBuilder {
    private Estado estado;
    private String asiento;
    private Usuario dueño;
    private Evento evento;
    private String beneficios;

    public TicketBuilder setEstado(Estado estado) {
        this.estado = estado;
        return this;
    }

    public TicketBuilder setAsiento(String asiento) {
        this.asiento = asiento;
        return this;
    }

    public TicketBuilder setDueño(Usuario dueño) {
        this.dueño = dueño;
        return this;
    }

    public TicketBuilder setEvento(Evento evento) {
        this.evento = evento;
        return this;
    }

    public TicketBuilder setBeneficios(String beneficios) {
        this.beneficios = beneficios;
        return this;
    }

    public TicketGeneral buildGeneral() {
        return new TicketGeneral(estado, asiento, dueño, evento, beneficios);
    }

    public TicketReservado buildReservado() {
        return new TicketReservado(estado, asiento, dueño, evento, beneficios);
    }

    public TicketVIP buildVIP() {
        return new TicketVIP(estado, asiento, dueño, evento, beneficios);
    }
}

