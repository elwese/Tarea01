/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.mycompany.mavenproject3.BuscadorEventos;
import com.mycompany.mavenproject3.Cliente;
import com.mycompany.mavenproject3.Evento;
import com.mycompany.mavenproject3.GestorReservas;
import com.mycompany.mavenproject3.Ticket;
import com.mycompany.mavenproject3.TicketGeneral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ClienteTest {
    @Test
    public void testBuscarPorFecha() {
        BuscadorEventos buscador = new BuscadorEventos();
        List<Evento> eventos = buscador.buscarPorFecha("2023-12-25");
        assertNotNull(eventos, "Debe retornar una lista vacía en este caso.");
        assertEquals(0, eventos.size(), "La lista debe estar vacía si no hay eventos para la fecha.");
    }

    @Test
    public void testReservarTicket() {
        Cliente cliente = new Cliente("Juan", "Perez", "juanp", "12345");
        Ticket ticket = new TicketGeneral(); // Implementa Ticket
        GestorReservas gestor = new GestorReservas();

        assertTrue(gestor.reservarTicket(cliente, ticket), "La reserva del ticket debe ser exitosa.");
        assertEquals(1, cliente.getTicketsReservados().size(), "Debe haber un ticket reservado.");
    }
}
