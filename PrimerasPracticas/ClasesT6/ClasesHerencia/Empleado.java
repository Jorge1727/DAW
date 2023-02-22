package ClasesT6.ClasesHerencia;

public class Empleado extends Persona
{
    double sueldo;

    public Empleado(String nombre, int edad, double sueldo) 
    {
        super(nombre, edad);
        //this.nombre
        //this.edad
        this.sueldo = sueldo;
    }   

    //Modifico la salida del override
    @Override
    public String decirHola()
    {
        return "hola Empleado";
    }
}
    
