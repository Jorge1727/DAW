package AsuntosSociales.Usuarios;

import java.time.LocalDate;

import AsuntosSociales.Equipo.Trabajador;

public class Menor extends Usuario
{
    //Atributos
    LocalDate fechaNacimiento;
    String nombreTutor;

    //Constructor
    public Menor(String nombre, String apellidos, String dni, Trabajador trabajadorAsignado, LocalDate fechaUltimaVisita, LocalDate fechaNacimiento, String nombreTutor) 
    {
        super(nombre, apellidos, dni, trabajadorAsignado, fechaUltimaVisita);
        this.fechaNacimiento = fechaNacimiento;
        this.nombreTutor = nombreTutor;
    }

    //Metodos
    @Override
    public String muestraInformacion() 
    {
        return "Usuario MENOR: " + this.getNombre() + " " + this.getApellidos() + "(" + this.getDni() + ") - " + this.getTrabajadorAsignado() + " - ult visista: " + this.getFechaUltimaVisita();
    }

    @Override
    public boolean equals(Object o) 
    {
        boolean resultado = false;

        Usuario u2 = (Usuario)(o);

        if(this.getDni().equals(u2.getDni()))
            resultado = true;
        
        return resultado;
    }
    

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreTutor() {
        return nombreTutor;
    }

    public void setNombreTutor(String nombreTutor) {
        this.nombreTutor = nombreTutor;
    }

    

    
    
    
    
}
