package AsuntosSociales.Usuarios;

import java.time.LocalDate;

import AsuntosSociales.Equipo.Trabajador;

public class Familia extends Usuario
{
    //Atributos
    private String nombreCabezaFamilia;
    private int miembrosUnidad;

    //Constructor
    public Familia(String nombre, String apellidos, String dni, Trabajador trabajadorAsignado,
            LocalDate fechaUltimaVisita, String nombreCabezaFamilia, int miembrosUnidad) {
        super(nombre, apellidos, dni, trabajadorAsignado, fechaUltimaVisita);
        this.nombreCabezaFamilia = nombreCabezaFamilia;
        this.miembrosUnidad = miembrosUnidad;
    }

    //Metodos
    @Override
    public String muestraInformacion() 
    {
        return "Usuario: Familia: " + this.getApellidos() + ", " + this.nombreCabezaFamilia + " (" + this.getDni() + ") - " + this.getTrabajadorAsignado() + " - ult visita: " + getFechaUltimaVisita();
    }

    public String getNombreCabezaFamilia() {
        return nombreCabezaFamilia;
    }

    public void setNombreCabezaFamilia(String nombreCabezaFamilia) {
        this.nombreCabezaFamilia = nombreCabezaFamilia;
    }

    public int getMiembrosUnidad() {
        return miembrosUnidad;
    }

    public void setMiembrosUnidad(int miembrosUnidad) {
        this.miembrosUnidad = miembrosUnidad;
    }

    
        
}
