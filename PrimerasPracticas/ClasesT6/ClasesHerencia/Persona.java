package ClasesT6.ClasesHerencia;

public class Persona 
{    
    protected String nombre;
    int edad;
    int altura;


    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = 170;
    }

    public String decirHola()
    {
        return "hola persona";
    }
}
