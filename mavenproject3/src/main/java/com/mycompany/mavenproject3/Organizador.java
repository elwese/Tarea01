package com.mycompany.mavenproject3;

import java.util.List;

public class Organizador extends Usuario{
    String cedula;
    String compañia;
    List<Evento> eventosHechos;

    public Organizador(String cedula, String compañia, List<Evento> eventosHechos, String nombre, String apellido, String usuario, String contraseña) {
        super(nombre, apellido, usuario, contraseña);
        this.cedula = cedula;
        this.compañia = compañia;
        this.eventosHechos = eventosHechos;
    }

    public Organizador() {
    }
      
    public boolean definirPoliticasDevolucion(String descripcion, int porcentajeDevolver){
        return true;
    }
    public boolean definirPoliticasCambio(String descripcion, int diasPlazos){
        return true;
    }
    public boolean definirRestricciones(Ticket tipoTicket, int cantidad){
        return true;
    }
    
}

