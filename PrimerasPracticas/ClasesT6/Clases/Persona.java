package ClasesT6.Clases;

public class Persona 
{
    //Atributos de la clase
    String nombre;
    String apellidos;
    int edad;
    int estatura;
    String dni;

    //Contructores
    public Persona()
    {
        this.nombre = "Desconocido";
    }

    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad  = edad;
    }

    //metodos
    void saludar()
    {
        System.out.println("Hola soy " + nombre);
    }

    void cumlirAños()
    {
        edad++;
    }

    void cambiarNombre(String nombre)
    {
        this.nombre = nombre;
    }

    void cambiarPersona(Persona p1)
    {
        this.nombre = p1.nombre;
        this.edad = p1.edad;
    }

    //metodo estatico

    static String QueDiaEs()
    {
        String resultado = "Estoy bien";

        return resultado;
    }

    
}
