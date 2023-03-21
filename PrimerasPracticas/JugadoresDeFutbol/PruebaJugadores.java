package JugadoresDeFutbol;

import java.util.Arrays;

public class PruebaJugadores 
{
    public static void main(String[] args) 
    {
        Jugador j1 = new Jugador("Jorge", "El Pillo");
        Jugador j2 = new Jugador("Juan", "El Pro");
        Jugador j3 = new Jugador("Pedro", "El Makina");

        UtilesJugadores utiles = new UtilesJugadores();

        Jugador j4 = utiles.generaJugadorAleatorio();
        Jugador j5 = utiles.generaJugadorAleatorio();

        Campo cancha = new Campo("santiago bernabeu");

        cancha.addJugador(j3);
        cancha.addJugador(j1);
        cancha.addJugador(j2);
        cancha.addJugador(j4);
        cancha.addJugador(j5);

        j1.hacerGol();
        j1.hacerGol();
        j3.hacerGol();
        j3.cometerFalta();
        j3.cometerFalta();
        j2.cometerFalta();

        //CompareTo de la clase jugador
        System.out.println(Arrays.toString(cancha.getJugadores()));

        Arrays.sort(cancha.getJugadores());

        System.out.println(Arrays.toString(cancha.getJugadores()));

        //Ordenado por apodos de la clase OrdenacionApodos
        OrdenacionApodos comparadorPorApodos = new OrdenacionApodos();
        Arrays.sort(cancha.jugadores, comparadorPorApodos);

        System.out.println(Arrays.toString(cancha.jugadores));

        //Ordenado por goles de la clase OrdenacionGoles
        j5.hacerGol();
        j5.hacerGol();
        j5.hacerGol();
        j5.hacerGol();
        j5.hacerGol();
        j5.hacerGol();
        OrdenacionGoles comparadorPorGoles = new OrdenacionGoles();
        Arrays.sort(cancha.jugadores,comparadorPorGoles);

        System.out.println(Arrays.toString(cancha.jugadores));
        
        //Ordenado por faltas de la clase OrdenacionFaltas
        OrdenacionFaltas comparadorPorFaltas = new OrdenacionFaltas();
        Arrays.sort(cancha.jugadores,comparadorPorFaltas);

        System.out.println(Arrays.toString(cancha.jugadores));
    }
    
}
