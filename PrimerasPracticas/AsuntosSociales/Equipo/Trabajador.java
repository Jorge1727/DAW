package AsuntosSociales.Equipo;

public class Trabajador 
{
    //Atributos
    private enum Tipo {PUEBLO, COSTA, FARO};

    private String nombre;
    private String dni;
    private String nombreTitulacion;
    private int añoTitulacion;
    private int sueldo;
    private Tipo tipo;

    //Constructor
    public Trabajador(String nombre, String dni, String nombreTitulacion, int añoTitulacion, String tipo) 
    {
        this.nombre = nombre;
        this.dni = dni;
        this.nombreTitulacion = nombreTitulacion;
        this.añoTitulacion = añoTitulacion;
        this.sueldo = 1000;
        this.tipo = Tipo.valueOf(tipo.toUpperCase());
    }

    //Metodos
    @Override
    public boolean equals(Object o)
    {
        boolean resultado = false;

        Trabajador t2 = (Trabajador)(o);

        if(this.dni.equals(t2.getDni()))
            resultado = true;
        
        return resultado;
    }

    @Override
    public String toString()
    {
        return this.nombre;
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

    public String getNombreTitulacion() {
        return nombreTitulacion;
    }

    public void setNombreTitulacion(String nombreTitulacion) {
        this.nombreTitulacion = nombreTitulacion;
    }

    public int getAñoTitulacion() {
        return añoTitulacion;
    }

    public void setAñoTitulacion(int añoTitulacion) {
        this.añoTitulacion = añoTitulacion;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    
    
    
}
