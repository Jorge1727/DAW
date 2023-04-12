package Matrix.Personajes;

public class Neo extends Personajes
{
    //Atributos
    private boolean elegido;
    private int poder;

    //Constructor
    public Neo(String nombre, String nombreCiudad, int poder) 
    {
        super(nombre, nombreCiudad);
        this.poder = poder;
    }

    @Override
    public String mostrarInformacion() 
    {
        return getNombre() + ", Ciudad: " + getNombreCiudad() + ", elegido?: " + this.elegido + ", Poder: " + this.poder;
    }

    public boolean esElElegido()
    {
        boolean resultado = false;

        int rndm = (int)(Math.random() * 101);

        if(rndm > 50)
            resultado = true;

        return resultado;
    }

    
    
    
}
