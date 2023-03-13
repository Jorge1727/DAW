package examenClases_JorgeTapia.Clases.Personas;

public abstract class Persona 
{
    //Atributos
    public String nombre;
    public String apellidos;

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