package Colecciones.EjerClassroom;

import java.util.ArrayList;
import java.util.Collections;

public class Ej2 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> lista = new ArrayList<>();

        addNum(lista);

        System.out.println(lista);

        System.out.println(suma(lista));
        System.out.println(Collections.max(lista));
        System.out.println(Collections.min(lista));
         

    }

    public static void addNum(ArrayList<Integer> lista)
    {
        int rndm = (int)((Math.random() * 11) + 10);

        for (int i = 0; i < rndm; i++) 
        {
            rndm = (int)(Math.random() * 100);
            
            lista.add(rndm);
        }
    }

    public static int suma(ArrayList<Integer> lista)
    {
        int suma = 0;

        for (Integer numero : lista) 
        {
            suma += numero;    
        }

        return suma;
    }
}
