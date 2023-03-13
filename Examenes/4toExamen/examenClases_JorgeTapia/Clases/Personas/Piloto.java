package examenClases_JorgeTapia.Clases.Personas;

public class Piloto extends Persona
{
    //Atributos
    private int anioTitulo;

    //Constructor
    public Piloto(String nombre, String apellidos, int anioTitulo) 
    {
        super(nombre, apellidos);
        this.anioTitulo = anioTitulo;
    }

    //metodos
    @Override
    public String informacion()
    {
        return getNombre() + getApellidos() + getAnioTitulo();
    }
    
    public int getAnioTitulo() {
        return anioTitulo;
    }
}
