package JugadoresDeFutbol;

public class Campo
{
    private String nombreNegocio;
    private double dineroEnCaja;
    public Jugador[] jugadores;

    //constr
    public Campo(String nombre)
    {
        this.nombreNegocio = nombre;
        dineroEnCaja = 0;
        jugadores = new Jugador[0];
    }

    //metodos
    public void addJugador(Jugador jugador) {
        //Inserto el el array de Jugadors
        Jugador[] nuevaCola = new Jugador[this.jugadores.length+1];

        for (int i = 0; i < this.jugadores.length; i++) 
        {
            nuevaCola[i] = this.jugadores[i];
        }

        nuevaCola[nuevaCola.length-1] = jugador;

        this.jugadores = nuevaCola;
    }

    

    public String getNombreNegocio() {
        return nombreNegocio;
    }

    public void setNombreNegocio(String nombreNegocio) {
        this.nombreNegocio = nombreNegocio;
    }

    public double getDineroEnCaja() {
        return dineroEnCaja;
    }

    public void setDineroEnCaja(double dineroEnCaja) {
        this.dineroEnCaja = dineroEnCaja;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    
}
