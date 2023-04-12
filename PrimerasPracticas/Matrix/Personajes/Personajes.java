package Matrix.Personajes;

import java.time.LocalDateTime;

public abstract class Personajes 
{
    //Atributos
    private int cod = 1;

    private int num_cod;
    private String nombre;
    private String nombreCiudad;
    private LocalDateTime fechaHoraCreacion;

    //Constructor
    public Personajes(String nombre, String nombreCiudad) 
    {
        this.num_cod = cod;
        this.nombre = nombre;
        this.nombreCiudad = nombreCiudad;
        this.fechaHoraCreacion = LocalDateTime.now();
    }

    //Metodos
    public abstract String mostrarInformacion();


    
}
