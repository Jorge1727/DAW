package Colecciones.clases;

public class Alumno extends Persona
{
    public Alumno(String nombre, String dni, int edad) {
        super(nombre, dni, edad);
    }

    //atrib
    private String curso;

    //Constr
    

    //metodods
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public String toString()
    {
        return getNombre();
    }
    
}
