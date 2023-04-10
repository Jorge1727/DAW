package ClasesT6.EjerColectionInterfaces.Ejer3;

import java.util.HashSet;

public class UsoSorteo 
{
    public static void main(String[] args) 
    {
        Sorteo <Integer> sorteoNumeros = new Sorteo<>();

        sorteoNumeros.add(10);
        sorteoNumeros.add(9);
        sorteoNumeros.add(8);
        sorteoNumeros.add(1);
        sorteoNumeros.add(2);
        sorteoNumeros.add(3);
        sorteoNumeros.add(5);

        Sorteo <String> sorteoPersonas = new Sorteo<>();

        sorteoPersonas.add("Juan");
        sorteoPersonas.add("Maria");
        sorteoPersonas.add("Jose");
        sorteoPersonas.add("roberto");
        sorteoPersonas.add("julian");
        sorteoPersonas.add("pepe");
        sorteoPersonas.add("Jorge");

        HashSet<String> ganadores = (HashSet<String>) sorteoPersonas.premiados(2);
        HashSet<Integer> numPremiados = (HashSet<Integer>) sorteoNumeros.premiados(2);
        

        System.out.println(ganadores);
        System.out.println(numPremiados);
            
    }
}
