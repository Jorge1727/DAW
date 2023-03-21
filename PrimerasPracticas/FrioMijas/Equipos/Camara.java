package FrioMijas.Equipos;

public class Camara extends Equipo
{
    //Atributos
    int temperaturaMinMax;

    //Constructor
    public Camara(double alto, double ancho, double profundidad, int frigorias, String marca, int temperaturaMinMax) 
    {
        super(alto, ancho, profundidad, frigorias, marca);
        this.temperaturaMinMax = temperaturaMinMax;
    }

    //Metodos

    @Override
    public void consumo() 
    {
        System.out.println("Consumo: " + this.temperaturaMinMax + super.volumen() + (super.getFrigorias() * 3));
    }

    @Override
    public String toString()
    {
        return super.toString() + " de tipo: FRIGORIFICO";
    }    
}
