package examenClases_JorgeTapia.RRHH;

public abstract class Persona 
{
    //Atributos
    private String nombre;
    private String apellidos;

    //Cosntructor
    public Persona(String nombre, String apellidos) 
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    //Metodos
    public abstract String informacion(); 

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    

    
}