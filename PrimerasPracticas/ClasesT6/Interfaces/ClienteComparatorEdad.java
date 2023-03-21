package ClasesT6.Interfaces;

import java.util.Comparator;

public class ClienteComparatorEdad implements Comparator
{
    @Override
    public int compare(Object arg0, Object arg1)
    {
        Cliente c1 = (Cliente)arg0; 
        Cliente c2 = (Cliente)arg1;

        return c1.getEdad() - c2.getEdad();
    }
}
