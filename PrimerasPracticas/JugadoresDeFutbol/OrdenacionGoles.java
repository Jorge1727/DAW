package JugadoresDeFutbol;

import java.util.Comparator;

public class OrdenacionGoles implements Comparator
{
    @Override
    public int compare(Object arg0, Object arg1)
    {
        Jugador j1 = (Jugador)arg0; 
        Jugador j2 = (Jugador)arg1;

        return j2.getNumeroGoles() - j1.getNumeroGoles();
    }
}
