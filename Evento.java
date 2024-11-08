
import java.util.List;

public class Evento {
    public List<String> fechas;
    public String artista;
    public List<String> ubicaciones;
    public List<Ticket> tickets;

    public Evento(int cantGeneral, int cantVIP, int cantReservados){
        for(int i=0;i<cantGeneral;i++){
            tickets.add(new Ticket_general());
        }
        for(int i=0;i<cantReservados;i++){
            tickets.add(new Ticket_VIP());
        }
        for(int i=0;i<cantVIP;i++){
            tickets.add(new Ticket_reservado());
        }
    }
}
