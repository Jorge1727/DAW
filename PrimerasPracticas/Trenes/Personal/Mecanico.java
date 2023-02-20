package Trenes.Personal;

public class Mecanico 
{
    //Atributos
    public enum Especialidad { FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR};

    private String nombre;
    private String telefono;
    private Especialidad especialidad;

    //Constructor
    public Mecanico(String nombre, String telefono, Especialidad especialidad) 
    {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }
    
    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }



    @Override
    public String toString() 
    {
        return "Mecanicos NOMBRE: " + getNombre() + ", TELEFONO: " + getTelefono() + ", ESPECIALIDAD: " + getEspecialidad();
    }

    
}
