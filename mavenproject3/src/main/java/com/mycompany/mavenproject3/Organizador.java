
package com.mycompany.mavenproject3;

import java.util.List;


public class Organizador extends Usuario{
    String cedula;
    String compañia;
    List<Evento> eventosHechos;
    
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
