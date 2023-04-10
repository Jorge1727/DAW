package ClasesT6.EjerColectionInterfaces.Ejer3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Sorteo <T extends Comparable <T>>
{
    //Atributos
    private HashSet <T> bolsa;

    //Constructor
    public Sorteo()
    {
        bolsa = new HashSet<>();
    }

    //metoodos

    public boolean add(T elemento)
    {
        return bolsa.add(elemento);
    }

    public Set<T> premiados(int numeroPremiados)
    {
        ArrayList<T> ordenar = new ArrayList<>(bolsa);

        //voy a ordenar los elmento
        Collections.sort(ordenar);

        //desordenar de forma aleatoria
        Collections.shuffle(ordenar);


        //devolver los x primeros
        Set <T> bolsaPremiados = new HashSet<>();
        for (int i = 0; i < numeroPremiados; i++) 
        {
            bolsaPremiados.add(ordenar.get(i));
        }

        return bolsaPremiados;
    }
}
