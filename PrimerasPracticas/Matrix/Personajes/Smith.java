package Matrix.Personajes;

public class Smith extends Personajes
{
    //Atributos
    private int poderDeInfeccion;
    private int id;
    //Constructor
    public Smith(String nombre, String nombreCiudad, int poderDeInfeccion) 
    {
        super(nombre, nombreCiudad);
        this.poderDeInfeccion = poderDeInfeccion;
        this.id = super.getCod();
    }

    public Smith(String nombre, String nombreCiudad, int poderDeInfeccion, int id) 
    {
        super(nombre, nombreCiudad);
        this.poderDeInfeccion = poderDeInfeccion;
        this.id = id;
    }

    //Metodos
    

    @Override
    public String mostrarInformacion()
    {
        return "||" + getNombre() + ", Ciudad: " + getNombreCiudad() + ", Poder de Infeccion: " + this.poderDeInfeccion;
    }

    @Override
    public String toString() {
        return "| S";
    }
    
    @Override
    public int getCod() {
        return super.getCod();
    }

    public int getPoderDeInfeccion() {
        return poderDeInfeccion;
    }
    
}
