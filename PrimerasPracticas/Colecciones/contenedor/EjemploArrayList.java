package Colecciones.contenedor;

import java.util.ArrayList;

public class EjemploArrayList 
{
    public static void main(String[] args) 
    {
        ArrayList<String> listaNombre = new ArrayList<>();

        listaNombre.add("Pepe");
        listaNombre.add("David");
        listaNombre.add("Maria");
        listaNombre.add("Jorge");
        
        System.out.println(listaNombre.toString());

        boolean contiene = listaNombre.contains("JORGE");
        System.out.println(contiene);
        contiene = listaNombre.contains("Jorge");
        System.out.println(contiene);

        System.out.println(listaNombre.lastIndexOf("Jorge"));
        
    }    
}
