package EquipoDeFutbol;

public class Jugador 
{
    //Atributos
    public enum Posicion { PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO};
    
    private String dni;
    private String nombre;
    private Posicion tipoPosicion;
    
    //Constructor
    public Jugador(String dni, String nombre, String posicion) 
    {
        this.dni = dni;
        this.nombre = nombre;
        this.tipoPosicion = Posicion.valueOf(posicion.toUpperCase());
    }

    //Metodos
    @Override
    public String toString() 
    {
        return this.nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Posicion getTipoPosicion() {
        return tipoPosicion;
    }

    public void setTipoPosicion(Posicion tipoPosicion) {
        this.tipoPosicion = tipoPosicion;
    }

    

}
