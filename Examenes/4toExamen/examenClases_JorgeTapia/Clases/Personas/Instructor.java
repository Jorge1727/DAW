package examenClases_JorgeTapia.Clases.Personas;

public class Instructor extends Persona
{
    //Atributo
    public double sueldo;

    //Constructor
    public Instructor(String nombre, String apellidos, double sueldo) 
    {
        super(nombre, apellidos);
        this.sueldo = sueldo;
    }

    public Instructor(String nombre, String apellidos) 
    {
        super(nombre, apellidos);
        sueldo = 1000;
    }

     //metodos
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String informacion()
    {
        return getNombre() + getApellidos() + getSueldo();
    }
    
}
