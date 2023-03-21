package FrioMijas.Equipos;

public class Frigorifico extends Equipo
{
    //Atributos

    //Constructor
    public Frigorifico(double alto, double ancho, double profundidad, int frigorias, String marca) 
    {
        super(alto, ancho, profundidad, frigorias, marca);
    }

    //Metodos

    @Override
    public void consumo() 
    {
        System.out.println("Consumo: " + super.volumen() + (super.getFrigorias() * 3));
    }

    @Override
    public String toString()
    {
        return super.toString() + " de tipo: FRIGORIFICO";
    }
}
