package JugadoresDeFutbol;

import java.util.Comparator;

public class OrdenacionApodos implements Comparator
{
    public int compare(Object arg0, Object arg1)
    {
        Jugador c1 = (Jugador)arg0;
        Jugador c2 = (Jugador)arg1;

        int resultado = 0;

        if(c1.getApodo().compareTo(c2.getApodo()) > 0)
        {
            resultado = 1;
        }
        else if(c1.getApodo().compareTo(c2.getApodo()) < 0)
        {
            resultado = -1;
        }

        return resultado;
    }
}
