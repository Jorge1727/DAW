package EquipoDeFutbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import EquipoDeFutbol.Jugador.Posicion;

public class Main 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        Jugador por1 = new Jugador("111111", "Neuer", "portero");
        Jugador por2 = new Jugador("222222", "Courtois", "portero");
        Jugador def1 = new Jugador("333333", "McGuire", "defensa");
        Jugador def2 = new Jugador("444444", "Virgil", "defensa");
        Jugador del1 = new Jugador("555555", "Cristiano", "delantero");
        Jugador del2 = new Jugador("666666", "Messi", "delantero");

        Map<Integer, Jugador> plantilla = new HashMap<>();
        
        altaJugador(plantilla, 1 ,por1);
        altaJugador(plantilla, 13 ,por2);
        altaJugador(plantilla, 2 ,def1);
        altaJugador(plantilla, 4 ,def2);
        altaJugador(plantilla, 7 ,del1);
        altaJugador(plantilla, 9 ,del2);

        mostrar(plantilla);

        System.out.println("Elimino al jugador: " + eliminarJugador(plantilla, 9));

        mostrar(plantilla);
        mostrar(plantilla, "defensa");
        
        editarJugador(plantilla, 2);

        mostrar(plantilla);
        
    }   
    
    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal)
    {
        System.out.println("Dni jugador: ");
        String dni = sc.nextLine();

        System.out.println("Nombre jugador: ");
        String nombre = sc.nextLine();

        System.out.println("Posicion jugador: ");
        String posicion = sc.nextLine();

        Jugador jugador = new Jugador(dni, nombre, posicion);

        plantilla.put(dorsal, jugador);
    }

    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador)
    {
        plantilla.put(dorsal, jugador);
    }

    static Jugador eliminarJugador(Map<Integer, Jugador>plantilla, Integer dorsal)
    {
        Jugador jugadorEliminar = plantilla.get(dorsal);

        plantilla.remove(dorsal);

        return jugadorEliminar;
    }

    static void mostrar(Map<Integer, Jugador> plantilla)
    {
        System.out.println(plantilla);
    }

    static void mostrar(Map<Integer, Jugador> plantilla, String posicion)
    {
        ArrayList<Integer> claves = new ArrayList<>();
        Posicion pos = Posicion.valueOf(posicion.toUpperCase());

        for(int llave: plantilla.keySet())
        {
            claves.add(llave);
        }

        for (int i = 0; i < plantilla.size(); i++) 
        {
            Jugador jugador = plantilla.get(claves.get(i));
        
            if(jugador.getTipoPosicion() == pos)
            {
                System.out.println(jugador);
            }
        }
    }

    static boolean editarJugador(Map<Integer, Jugador>plantilla, Integer dorsal)
    {
        boolean resultado = false;

        Jugador jugador = plantilla.get(dorsal);

        if(jugador != null)
        {
            String dniAnt = jugador.getDni();

            plantilla.remove(dorsal);

            System.out.println("Nombre jugador: ");
            String nombre = sc.nextLine();

            System.out.println("Posicion jugador: ");
            String posicion = sc.nextLine();

            Jugador jugadorNuevo = new Jugador(dniAnt, nombre, posicion);

            plantilla.put(dorsal, jugadorNuevo);
        }
        else 
        {
            System.out.println("No existe");
        }

        return resultado;
    }
}
