package FrioMijas.Equipos;

public abstract class Equipo 
{
    //Atributos
    private double alto;
    private double ancho;
    private double profundidad;
    private int frigorias;
    private String marca;

    //Constructor
    public Equipo(double alto, double ancho, double profundidad, int frigorias, String marca) 
    {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.frigorias = frigorias;
        this.marca = marca;
    }

    //Metodos
    public double volumen()
    {
        return this.alto * this.ancho * this.profundidad;
    }

    public String toString()
    {
        return "EQUIPO Marca: " + this.marca;
    }

    public abstract void consumo();

    public int getFrigorias() {
        return frigorias;
    }

    public String getMarca() {
        return marca;
    }

    


    
}
