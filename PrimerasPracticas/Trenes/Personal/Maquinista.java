package Trenes.Personal;

public class Maquinista 
{
    //Atributos
    private String nombre;
    private String dni;
    private double sueldo;
    private String rango;


    //Constructor
    public Maquinista(String nombre, String dni, double sueldo, String rango) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
    }

    public Maquinista(String nombre, String dni, double sueldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = "ayudante";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    
    @Override
    public String toString()
    {
        String resultado = "Maquinista: DNI: " + getDni() + " NOMBRE: " + getNombre() + " RANGO: " + getRango();

        return resultado;
    }
    
    
}
