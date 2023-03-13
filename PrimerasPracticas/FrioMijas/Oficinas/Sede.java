package FrioMijas;

public class Sede 
{
    //Atributos
    private static int codigoSede = 1;

    private String ciudad;
    private String direccion;
    private int cp;
    private int num_codigoSede;
    private Jefe jefeAsignado;

    //constructor
    public Sede(String ciudad, String direccion, int cp, Jefe jefeAsignado) 
    {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.cp = cp;
        this.num_codigoSede = codigoSede;
        this.jefeAsignado = jefeAsignado;
    }

    public Sede(String ciudad, String direccion, int cp) 
    {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.cp = cp;
        this.num_codigoSede = codigoSede;
        this.jefeAsignado = null;
    }

    

    
}
