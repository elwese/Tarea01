/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Cesar
 */
public abstract class TicketFactory {
    public abstract Ticket crearTicket(Estado estado, String asiento, Usuario dueño, Evento evento, String beneficios);
}
