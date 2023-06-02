package clases;

import java.util.ArrayList;


public class Agenda 
{
    //A
    ArrayList<Evento> eventos;

    //C
    public Agenda() {
    }

    //M
    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    @Override
    public String toString() {
        return "Agenda [eventos=" + eventos + "]";
    }

    
    
}
