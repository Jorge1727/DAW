package ClasesT6.EjerColectionInterfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ejercicio2 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> listNumeros = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("De que tamaño quieres la lista");
        int size = sc.nextInt();
        
        int elementosTotales = 0;
        while(elementosTotales < size)
        {
            int rndm = (int)(Math.random() * 10) + 1;
            
            listNumeros.add(rndm);

            elementosTotales++;
        }
        
        System.out.println(listNumeros.toString() + "\nTamaño: " + listNumeros.size());
        
        System.out.println("Que numero quieres eliminar?");
        int eliminar = sc.nextInt();

        int i = 0;
        while(i < listNumeros.size())
        {
            if(listNumeros.get(i) == eliminar)
            {
                listNumeros.remove(i);
            }

            i++;
        }

        System.out.println(listNumeros.toString() + "\nTamaño: " + listNumeros.size());


        System.out.println("Que numero quieres eliminar? (ITERATOR)");
        eliminar = sc.nextInt();
        // Get the iterator
        Iterator<Integer> it = listNumeros.iterator();

        while(it.hasNext()) 
        {
            if(it.next() == eliminar)
            {
                it.remove();
            }
        }
        sc.close();

        System.out.println(listNumeros.toString() + "\nTamaño: " + listNumeros.size());

    }
}
