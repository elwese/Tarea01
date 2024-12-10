
package com.mycompany.mavenproject3;

import java.util.List;


public class Cliente extends Usuario{
    public List<Evento> buscarPorFecha(String fecha){
        return null;
    }
    public List<Evento> buscarPorArtista(String fecha){
        return null;
    }
    public List<Evento> buscarPorLugar(String fecha){
        return null;
    }
    public List<Evento> buscarPorTipoMusica(String fecha){
        return null;
    }
    public boolean reservarTicket(int cantidad, Ticket tipoTicket, Evento evento){
        return true;
    }
}
