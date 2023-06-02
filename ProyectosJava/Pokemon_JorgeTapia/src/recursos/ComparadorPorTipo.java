package recursos;

import java.util.Comparator;

import clases.Pokemon;

public class ComparadorPorTipo implements Comparator<Pokemon>
{
    @Override
    public int compare(Pokemon o1, Pokemon o2) 
    {
        return o1.getType().getClass().getName().compareTo(o2.getType().getClass().getName());
    }
}