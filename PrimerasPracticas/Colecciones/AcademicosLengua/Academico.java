package Colecciones.AcademicosLengua;

public class Academico implements Comparable <Academico>
{
    //Atributos
    private String nombre;
    private int anioIngreso;

    //Constructor
    public Academico(String nombre, int anioIngreso) 
    {
        this.nombre = nombre;
        this.anioIngreso = anioIngreso;
    }

    //Metodos
    @Override
    public int compareTo(Academico a2) 
    {

        //SI ES POR NONBRE
        if(this.nombre.compareTo(a2.getNombre()) == 0)
        {
            return this.anioIngreso - a2.anioIngreso;
        }
        else 
        {
            return this.nombre.compareTo(a2.getNombre());
        }

        // int resultado = 0;

        // if(this.nombre.compareTo(a2.getNombre()) > 0)
        // {
        //     resultado = 1;
        // }
        // else if(this.nombre.compareTo(a2.getNombre()) < 0)
        // {
        //     resultado = -1;
        // }
        // else if(this.anioIngreso > a2.anioIngreso)
        // {
        //     resultado = 1;
        // }
        // else if(this.anioIngreso < a2.anioIngreso)
        // {
        //     resultado = -1;
        // }

    }

    @Override
    public String toString()
    {
        return "Academico: "+ this.nombre + ", Año de ingreso: " + this.anioIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }
    
}
