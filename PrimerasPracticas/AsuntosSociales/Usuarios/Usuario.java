package AsuntosSociales.Usuarios;

import java.time.LocalDate;

import AsuntosSociales.Equipo.Trabajador;

public abstract class Usuario 
{
    //Atributos
    static int cod = 1;

    private int num_cod;
    private String nombre;
    private String apellidos;
    private String dni;
    private Trabajador trabajadorAsignado;
    private LocalDate fechaUltimaVisita;

    //Constructor
    public Usuario(String nombre, String apellidos, String dni, Trabajador trabajadorAsignado, LocalDate fechaUltimaVisita) 
    {
        this.num_cod = cod;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.trabajadorAsignado = trabajadorAsignado;
        this.fechaUltimaVisita = fechaUltimaVisita;

        cod++;
    }

    //Metodos
    public abstract String muestraInformacion();

    @Override
    public boolean equals(Object o) 
    {
        boolean resultado = false;

        Usuario u2 = (Usuario)(o);

        if(this.dni.equals(u2.getDni()))
            resultado = true;
        
        return resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Trabajador getTrabajadorAsignado() {
        return trabajadorAsignado;
    }

    public void setTrabajadorAsignado(Trabajador trabajadorAsignado) {
        this.trabajadorAsignado = trabajadorAsignado;
    }

    public LocalDate getFechaUltimaVisita() {
        return fechaUltimaVisita;
    }

    public void setFechaUltimaVisita(LocalDate fechaUltimaVisita) {
        this.fechaUltimaVisita = fechaUltimaVisita;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public static int getCod() {
        return cod;
    }

    public static void setCod(int cod) {
        Usuario.cod = cod;
    }
    
    public int getNum_cod() {
        return num_cod;
    }

    public void setNum_cod(int num_cod) {
        this.num_cod = num_cod;
    }

    
}
