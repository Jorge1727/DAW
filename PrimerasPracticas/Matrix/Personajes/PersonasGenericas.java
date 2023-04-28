package Matrix.Personajes;

import java.util.ArrayList;

public class PersonasGenericas extends Personajes
{
    //Atributos
    private int probabilidadDeMorir;
    private int num_cod;
    
    //Constructor
    public PersonasGenericas(String nombre, String nombreCiudad, int probabilidadDeMorir) {
        super(nombre, nombreCiudad);
        this.probabilidadDeMorir = probabilidadDeMorir;
    }

    //Metodos

    @Override
    public String mostrarInformacion()
    {
        
        return 
    }

    @Override
    public int getCod() {
        return super.getCod();
    }
    
}