package practicasArrays.Barcos.Barcos;

public class Capitan 
{
    //Atributos
    private String nombre;
    private int anioTitulo;

    //Constructor
    public Capitan(String nombre, int anioTitulo) 
    {
        this.nombre = nombre;
        this.anioTitulo = anioTitulo;
    }

    //metodos
    @Override
    public String toString()
    {
        //ToString?

        return "Capitan: "+ this.getNombre() + " Año titulo: "+ this.anioTitulo;
    }
    
    public int getAnioTitulo() {
        return anioTitulo;
    }

    public String getNombre() {
        return nombre;
    }
}
