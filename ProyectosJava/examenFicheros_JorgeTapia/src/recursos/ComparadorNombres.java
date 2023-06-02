package recursos;

import java.util.Comparator;

import clases.Cliente;

public class ComparadorNombres implements Comparator<Cliente>
{
    @Override
    public int compare(Cliente o1, Cliente o2) 
    {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}