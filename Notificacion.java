/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tarea1;

import java.util.List;

public class Notificacion {
    private String descripcion;
    private String tipo;

    public boolean enviarNotificacionDifusionEvento(List<Usuario> compradores, Evento evento) {
        return true;
    }

    public boolean enviarNotificacionEstadoPago(Usuario usuario, Cobro orden) {
        return true;
    }
}
