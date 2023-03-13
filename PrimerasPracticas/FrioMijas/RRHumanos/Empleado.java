package FrioMijas;

public class Empleado 
{
    //Atributos
    
    private static int codigo = 1;

    private String nombre;
    private String apellido;
    private int edad;
    private double salario;
    private String dni;
    private int num_codigo;

    //Constructor
    public Empleado(String nombre, String apellido, int edad, double salario, String dni) 
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
        this.dni = dni;
        this.num_codigo = codigo;

        codigo++;
    }

    //Metodos
    
    @Override
    public boolean equals(Object obj1)
    {
        boolean resultado = false;

        //convertir objeto a la clase persona
        Empleado empleado = (Empleado)obj1;

        if(empleado.dni == this.dni)
        {
            resultado = true;
        }

        return resultado;
    }
    

    
}
