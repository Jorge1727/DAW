package Colecciones.EjerClassroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Ej23 
{
    public static void main(String[] args) 
    {
        HashMap<nombres, Integer> piezas = new HashMap<>();
        piezas.put(nombres.DAMA, 9);
        piezas.put(nombres.TORRE, 5);
        piezas.put(nombres.ALFIL, 3);
        piezas.put(nombres.CABALLO, 2);
        piezas.put(nombres.PEON, 1);

        ArrayList<nombres> tablero = new ArrayList<>();
        tablero.add(nombres.DAMA);
        tablero.add(nombres.TORRE);
        tablero.add(nombres.TORRE);
        tablero.add(nombres.ALFIL);
        tablero.add(nombres.ALFIL);
        tablero.add(nombres.CABALLO);
        tablero.add(nombres.CABALLO);
        tablero.add(nombres.PEON);
        tablero.add(nombres.PEON);
        tablero.add(nombres.PEON);
        tablero.add(nombres.PEON);
        tablero.add(nombres.PEON);
        tablero.add(nombres.PEON);
        tablero.add(nombres.PEON);
        tablero.add(nombres.PEON);
        Collections.shuffle(tablero);

        int totalPuntos = 0;

        int capturas = (int)(Math.random() * 15) + 1;

        for (int i = 0; i < capturas-1; i++) 
        {
            nombres name = tablero.get(i);
            int puntos = piezas.get(name);

            System.out.println(name + ": " + puntos + " puntos");

            totalPuntos += puntos;
        }

        System.out.println("total de Puntos: " + totalPuntos);

    }

    public enum nombres {DAMA, TORRE, ALFIL, CABALLO, PEON};
    
}