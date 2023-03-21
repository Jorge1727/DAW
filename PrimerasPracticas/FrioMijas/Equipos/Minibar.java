package FrioMijas.Equipos;

public class Minibar extends Equipo
{
    //Atributos
    int numeroBaldas;

    //Constructor
    public Minibar(double alto, double ancho, double profundidad, int frigorias, String marca, int numeroBaldas) 
    {
        super(alto, ancho, profundidad, frigorias, marca);
        this.numeroBaldas = numeroBaldas;
    }

    @Override
    public void consumo() 
    {
        System.out.println("Consumo: " + this.numeroBaldas + (super.getFrigorias() * 2));
    }

    @Override
    public String toString()
    {
        return super.toString() + " de tipo: MINIBAR";
    }
    
        
}
