package JugadoresDeFutbol;

public class UtilesJugadores 
{
    //Atributos
    private String[] nombres = {"Juan", "Pedro", "María", "Ana", "Luis", "Carlos", "Sofía", "Lucía", "Elena", "Miguel"};
    private String[] apellidos = {"García", "Fernández", "Martínez", "González", "Pérez", "López", "Ruiz", "Sánchez", "Hernández", "Jiménez"};
    private String[] apodo1 = {"Grande", "Pulga", "Raton", "Mago", "La roca", "Titan", "Cabeza", "Jardinero", "Carnicero", "Muñeco", "Burro", "Pantera"};
    private String[] apodo2 = {"de Oro", "de los mares", "de Mijas", "de Titanio", "loca", "Blanco", "Negro"};

    public Jugador generaJugadorAleatorio()
    {
        Jugador jugador = new Jugador();

        int aleatorio = (int)(Math.random() * 9) + 1;
        int aleatorio2 = (int)(Math.random() * 9) + 1;

        jugador.setNombreCompleto(nombres[aleatorio] + " " + apellidos[aleatorio2]);

        aleatorio = (int)(Math.random() * 11) + 1;
        aleatorio2 = (int)(Math.random() * 6) + 1;

        jugador.setApodo(apodo1[aleatorio] + " " + apodo2[aleatorio2]);

        return jugador;
    }
}
