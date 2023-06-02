package clases;

import java.util.ArrayList;

public class Profesor 
{
    //A
    private String nombre;
    private String codigo;
    private String especialidad;
    private ArrayList<Alumno> alumnos;
    
    //C
    public Profesor() {

    }

    //M
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Profesor [nombre=" + nombre + ", codigo=" + codigo + ", especialidad=" + especialidad + ", alumnos="
                + alumnos + "]";
    }

    

    
}
