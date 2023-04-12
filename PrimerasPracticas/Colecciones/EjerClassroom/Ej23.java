package Colecciones.EjerClassroom;

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

        int totalPeones = 0;


        int capturas = (int)(Math.random() * 15) + 1;

        for (int i = 0; i < capturas-1; i++) 
        {
            nombres[] nombrePieza = nombres.values();
            nombres n1 = nombrePieza[(int)(Math.random() *nombrePieza.length)];
            System.out.print(n1 + ", ");

            int valorPeones = piezas.get(n1);

            totalPeones += valorPeones;
        }

        System.out.println("total de peones: " + totalPeones);
        System.out.println(piezas);

    }

    public enum nombres {DAMA, TORRE, ALFIL, CABALLO, PEON};
    
}
