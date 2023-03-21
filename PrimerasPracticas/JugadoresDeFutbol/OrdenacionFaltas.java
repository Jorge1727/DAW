package JugadoresDeFutbol;

import java.util.Comparator;

public class OrdenacionFaltas implements Comparator 
{

    @Override
    public int compare(Object o1, Object o2) 
    {
        Jugador j1 = (Jugador)o1; 
        Jugador j2 = (Jugador)o2;

        return j2.getNumeroFaltas() - j1.getNumeroFaltas();
    }
        
}
