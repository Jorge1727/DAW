package Trenes.Personal;

import java.time.LocalDate;

public class JefeEstacion 
{
    //Atributos
    private String nombre;
    private String dni;
    LocalDate fechaNombramiento;

    //Constructor
    public JefeEstacion(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    //Metodos

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

    public LocalDate getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(LocalDate fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }

    
    public void modificarFechaCargo(int anio, int mes, int dia)
    {
        this.fechaNombramiento = LocalDate.of(anio, mes, dia);
    }

    @Override
    public String toString()
    {
        String resultado = "";

        if(this.fechaNombramiento == null)
        {
            resultado = "Jefe estacion: DNI: " + getDni() + " NOMBRE: " + getNombre();
        }
        else
        {
            resultado = "Jefe estacion: DNI: " + getDni() + " NOMBRE: " + getNombre() + " FECHA DE NOMBRAMIENTO: " + getFechaNombramiento();
        }

        return resultado;
    }
}
