package Colecciones.EjerClassroom.Ej8_9_12;

import java.util.ArrayList;
import java.util.HashMap;

//EJERCICIO IMPORTANTE

public class Ej12 
{
    public static void main(String[] args) 
    {
        HashMap<String, Integer> puntos = new HashMap<>();

        ArrayList<Carta> mazo = new ArrayList<>();

        puntos.put("AS", 11);
        puntos.put("tres", 10);
        puntos.put("sota", 2);
        puntos.put("caballo", 3);
        puntos.put("rey", 4);

        while(mazo.size() < 10)
        {
            Carta newCarta = new Carta();

            if(!mazo.contains(newCarta))
            {
                mazo.add(newCarta);
            }            
        }

        Integer totalPuntos = 0;

        

        for (Carta carta : mazo) 
        {
            String valorCarta = carta.getValor();

            if(puntos.containsKey(valorCarta))
            {
                totalPuntos += puntos.get(valorCarta);
            }
        }

        System.out.println("Total puntos: " + totalPuntos);

    }    
}
