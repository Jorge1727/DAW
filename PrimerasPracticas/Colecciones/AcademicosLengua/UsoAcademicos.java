package Colecciones.AcademicosLengua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UsoAcademicos
{
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        Map <Character, Academico> academia =  new HashMap<>();
        
        Academico a1 = new Academico("Juan", 2008);
        Academico a2 = new Academico("Pepe", 2001);
        Academico a3 = new Academico("Maria", 2004);
        Academico a4 = new Academico("Julian", 2003);
        Academico a5 = new Academico("Manolo", 2009);
        Academico a6 = new Academico("Maria", 1998);
        Academico a7 = new Academico("Pepi", 1994);

        nuevoAcademico(academia, a1, 'c');
        nuevoAcademico(academia, a2, 'B');
        nuevoAcademico(academia, a3, 'a');
        nuevoAcademico(academia, a4, 'A');
        nuevoAcademico(academia, a5, 'b');
        nuevoAcademico(academia, a6, 'z');
        nuevoAcademico(academia, a7, 'z');

        System.out.println(academia);

        // //Listado 1 nombre + año
        // ArrayList<Academico> listaAcademicos = (ArrayList<Academico>)academia.values();
        ArrayList<Academico> listaAcademicos = new ArrayList<>();
        listaAcademicos.addAll(academia.values());
        Collections.sort(listaAcademicos);
        System.out.println(listaAcademicos);

        //Listado 2 Letra + nombre + año - ordenado por letra
        TreeMap<Character, Academico> listaPorLetra = new TreeMap<>();
        listaPorLetra.putAll(academia);
        System.out.println(listaPorLetra);

        
    }
    
    static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevo, Character letra)
    {
        boolean resultado = false;
        // String decision = "";

        if(Character.isAlphabetic(letra))
        {
            if(academia.containsKey(letra))
            {
                System.out.println("Sillon: " + letra + " ya está ocupada");
                // System.out.println("Quieres sustituir? (yes, otra cosa no aplicara el cambio)");
                // decision = sc.nextLine().toLowerCase();

                // if(decision.equals("yes"))
                // {
                //     academia.put(letra, nuevo);
                //     resultado = true;
                // } 

            }
            else 
            {
                academia.put(letra, nuevo);
                resultado = true;
            }
        }
        else 
        {
            System.out.println("La letra del sillón no es válida");
        }
     
        return resultado;
    }
}
