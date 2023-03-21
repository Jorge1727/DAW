package FrioMijas.Equipos;

public class Arcon extends Equipo
{
    int tipoApertura;

    //Constructor
    public Arcon(double alto, double ancho, double profundidad, int frigorias, String marca, int tipoApertura) 
    {
        super(alto, ancho, profundidad, frigorias, marca);
        this.tipoApertura = tipoApertura;
    }

    @Override
    public void consumo() 
    {
        System.out.println("Consumo: " + this.tipoApertura + (super.getFrigorias() * 2));
    }

    @Override
    public String toString()
    {
        return super.toString() + " de tipo: ARCON";
    }    
}
