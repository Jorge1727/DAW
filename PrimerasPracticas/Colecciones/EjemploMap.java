package Colecciones;

import java.util.HashMap;
import java.util.HashSet;

import Colecciones.clases.Persona;

public class EjemploMap {
    public static void main(String[] args) {
        HashMap<Integer, String> alumnos = new HashMap<>();

        //SE USA Y PIESNA COMO SI FUERA UNA BASE DE DATOS

        //Inserta alumnos
        alumnos.put(1, "paco");
        alumnos.put(2, "alfredo");
        alumnos.put(3, "pepe");
        alumnos.put(4, "juan");

        System.out.println(alumnos);
    
        //Busca por clave
        String alumnoBuscado = alumnos.get(2);

        System.out.println("Alumno buscado: " + alumnoBuscado);
    

        if(alumnos.containsKey(4))
        {
            System.out.println("Si la contiene la calve 4" );
        }
        else
        {
            System.out.println("No esta  la clave 4");
        }

        boolean estaJose = alumnos.containsValue("juan");
        System.out.println("ESta juan? : " + estaJose);

        //Quitamos el 3
        alumnos.remove(3);
        System.out.println(alumnos);

        HashSet<Integer> conjuntoDeClaves = new HashSet<>( alumnos.keySet());
        System.out.println("las claves son: " + conjuntoDeClaves);

        for (Integer clave : conjuntoDeClaves) 
        {
            System.out.print(alumnos.get(clave) + ", ");
        }

        HashMap<Integer, Persona> claustro = new HashMap<>();

        Persona p1 = new Persona("Juan", "12345", 12);

        claustro.put(1, p1);

        System.out.println(claustro);

        Persona per = claustro.get(1);
        System.out.println();
        


    }
}
