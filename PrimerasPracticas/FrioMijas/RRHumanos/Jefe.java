package FrioMijas;

public class Jefe extends Empleado 
{
    //Atributos
    private Password pswd;

    //Constructor
    public Jefe(String nombre, String apellido, int edad, double salario, String dni) 
    {
        super(nombre, apellido, edad, salario, dni);
        this.pswd = new Password();
    }

        

}
