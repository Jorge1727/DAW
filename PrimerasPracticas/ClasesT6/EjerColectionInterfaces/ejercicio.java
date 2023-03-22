package ClasesT6.EjerColectionInterfaces;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class ejercicio 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> listNumeros = new ArrayList<>();
        Set<Integer> seRepite =new LinkedHashSet<>();//Lista auxiliar para ver si se repiten o no.
        Set<Integer> repetidos =new LinkedHashSet<>();
        Set<Integer> norepetidos =new LinkedHashSet<>();

        int elementosTotales = 0;
        while(elementosTotales < 20)
        {
            int rndm = (int)(Math.random() * 10) + 1;
            
            listNumeros.add(rndm);
            if(seRepite.add(rndm) == false)
            {
                repetidos.add(rndm);
            }

            elementosTotales++;
        }

        int size = listNumeros.size();

        for (int i = 0; i < size; i++) 
        {
            if(repetidos.contains(listNumeros.get(i)) == false)
            {
                norepetidos.add(listNumeros.get(i));
            }
        }

        System.out.println("Lista de numeros completa");
        System.out.println(listNumeros.toString());
        
        System.out.println("REPETIDOS");
        System.out.println(repetidos.toString());
        
        System.out.println("NO REPETIDOS");
        System.out.println(norepetidos.toString());


        //System.out.println(seRepite.toString());

        
    }
          
      

}
