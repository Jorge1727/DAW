package examenClases_JorgeTapia.RRHH;

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
        //ToString?

        return "Piloto: "+ this.getNombre() + " " + this.getApellidos() + " Año titulo: "+ this.anioTitulo;
    }
    
    public int getAnioTitulo() {
        return anioTitulo;
    }
}
