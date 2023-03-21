package ClasesT6.Interfaces;

public class Cliente implements Comparable
{
    //Atri
    private String nombre;
    private double dinero;
    private int edad;

    //Con
    public Cliente(String nombre, double dinero)
    {
        this.nombre = nombre;
        this.dinero = dinero;
    } 

    public Cliente(String nombre, double dinero, int edad)
    {
        this(nombre,dinero);
        this.edad = edad;
    }

    //Meto
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Object o) 
    {
        Cliente c = (Cliente)o;
        int resultado = 0; // presuponemos que son iguales

        //Comparamos por nombre
        if(this.nombre.compareTo(c.nombre) > 0)
        {
            resultado = 1;
        }
        else if(this.nombre.compareTo(c.nombre) < 0)
        {
            resultado = -1;
        }
        else
        {
            if(this.dinero > c.dinero)
            {
                resultado = 1;
            }
            else if(this.dinero < c.dinero)
            {
                resultado = -1;
            }
        }        

        //return (int)(this.dinero - c.dinero);
        return resultado;
    }

    @Override
    public String toString() {
        
        return this.nombre + "(" + this.dinero + ") " + "[" + this.edad + "]";
    }


    
}
