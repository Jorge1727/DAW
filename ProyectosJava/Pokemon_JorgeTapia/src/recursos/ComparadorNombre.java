package recursos;

import java.util.Comparator;

import clases.Pokemon;

public class ComparadorNombre implements Comparator<Pokemon>
{
    @Override
    public int compare(Pokemon o1, Pokemon o2) 
    {
        return o1.getName().compareTo(o2.getName());
    }
}
