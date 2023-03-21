package FrioMijas.RRHumanos;

public class Empleado
{
    //Atributos
    protected static int codigo = 1;

    protected int num_cod;
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected double salario;
    protected String dni;

    public Empleado(String nombre, String apellido, int edad, double salario, String dni) 
    {
        this.num_cod = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
        this.dni = dni;

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

    @Override
    public String toString()
    {
        return "Nombre del empleado: " + this.nombre;
    }

    public static int getCodigo() {
        return codigo;
    }

    public static void setCodigo(int codigo) {
        Empleado.codigo = codigo;
    }

    public int getNum_cod() {
        return num_cod;
    }

    public void setNum_cod(int num_cod) {
        this.num_cod = num_cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }


    
    
}
